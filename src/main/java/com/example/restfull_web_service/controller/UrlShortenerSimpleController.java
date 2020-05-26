package com.example.restfull_web_service.controller;

import com.example.restfull_web_service.pojo.UrlChanger;
import com.example.restfull_web_service.service.UrlShortenerService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class UrlShortenerSimpleController {

    private UrlShortenerService urlShortenerService;

    public UrlShortenerSimpleController(UrlShortenerService urlShortenerService) {
        this.urlShortenerService = urlShortenerService;
    }

    @GetMapping("/new")
    @ResponseBody
    public String addUrl(@RequestParam(name = "lurl") String longUrl) {
        return urlShortenerService.addUrlToDataBase(longUrl);
    }

/*    @GetMapping("/redirect")
    public getLongUrl(@RequestParam(name = "surl") String shortUrl) {
        return urlShortenerService.getUrlDataByShortUrl()
    }*/


    @GetMapping(value = "/redirect/{shortUrl}" )
    public RedirectView redirect(@PathVariable String shortUrl) {
        RedirectView redirectView = new RedirectView();
        //redirectView.setUrl("http://www." + urlShortenerService.getUrlDataByShortUrl(shortUrl).getLongUrl() + ".com");
        redirectView.setUrl( urlShortenerService.getUrlDataByShortUrl(shortUrl).getLongUrl());

        return redirectView;
    }

    public void deleteUrl() {
        urlShortenerService.clearDataBase();
    }

}
