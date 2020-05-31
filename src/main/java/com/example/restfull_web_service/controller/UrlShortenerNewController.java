package com.example.restfull_web_service.controller;

import com.example.restfull_web_service.pojo.UrlElement;
import com.example.restfull_web_service.service.UrlService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class UrlShortenerNewController {
    private UrlService urlService;

    public UrlShortenerNewController(UrlService urlService) {
        this.urlService = urlService;
    }

    @RequestMapping("/viewall")
    public String urlReceive(Model model) {
        model.addAttribute("urls", urlService.getAllUrlElements());
        model.addAttribute("title", "Hello World!");
        return "viewall";
    }

    @RequestMapping({"/", "/generate"})
    public String generateUrl(Model model) {
        model.addAttribute("urlElement", new UrlElement());
        return "generate";
    }

    @PostMapping("/receive")
    public String receiveUrl(@ModelAttribute UrlElement urlElement) {
        urlService.addUrlElement(urlElement.getLongAddress());
        return "receive";
    }

    @GetMapping(value = "/redirect/{shortUrl}")
    public RedirectView redirect(@PathVariable String shortUrl) {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(urlService.getUrlElement(shortUrl).getLongAddress());

        return redirectView;
    }

    @RequestMapping(value = "/index")
    public String mainPage(Model model) {
        return "indexmenu";
    }
}
