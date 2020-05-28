package com.example.restfull_web_service.controller;

import com.example.restfull_web_service.pojo.UrlChanger;
import com.example.restfull_web_service.service.UrlShortenerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UrlShortenerNewController {
    private UrlShortenerService urlShortenerService;

    public UrlShortenerNewController(UrlShortenerService urlShortenerService) {
        this.urlShortenerService = urlShortenerService;
    }

    @RequestMapping("/viewall")
    public String urlReceive(Model model) {
        model.addAttribute("urls", urlShortenerService.getAllDataBaseUrls());
        model.addAttribute("title", "Hello World!");
        return "viewall";
    }

    @RequestMapping({"/", "/generate"})
    public String generateUrl(Model model) {
        model.addAttribute("urlChanger", new UrlChanger());
        return "generate";
    }

    @PostMapping("/receive")
    public String receiveUrl(@ModelAttribute UrlChanger urlChanger) {
        urlChanger.setShortUrl(
                urlShortenerService.addUrlToDataBase(urlChanger.getLongUrl()));
        return "receive";
    }
}
