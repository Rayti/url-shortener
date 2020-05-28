package com.example.restfull_web_service.controller;

import com.example.restfull_web_service.service.UrlShortenerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UrlShortenerNewController {
    private UrlShortenerService urlShortenerService;

    public UrlShortenerNewController(UrlShortenerService urlShortenerService) {
        this.urlShortenerService = urlShortenerService;
    }

    @GetMapping("/viewall")
    public String urlReceive(Model model) {
        model.addAttribute("urls", urlShortenerService.getAllDataBaseUrls());
        model.addAttribute("title", "Hello World!");
        return "viewall";
    }

    @GetMapping("test")
    @ResponseBody
    public String testingClass() {
        return "Works fine!";
    }
}
