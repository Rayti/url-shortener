package com.example.restfull_web_service.service;

import com.example.restfull_web_service.dao.UrlRepository;
import com.example.restfull_web_service.pojo.UrlElement;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UrlService {
    private UrlRepository urlRepository;
    private UrlMenager urlMenager;

    public UrlService(UrlRepository urlRepository, UrlMenager urlMenager) {
        this.urlRepository = urlRepository;
        this.urlMenager = urlMenager;
    }
    public boolean addUrlElement(String longAddress) {
        UrlElement urlElement = urlMenager.generateUrlElem(longAddress);
        urlRepository.save(urlElement);
        return true;
        //return urlRepository.addUrlElement(UrlMenager.generateUrlElem(longAddress));
    }

    public boolean deleteUrlElementByLongAddress(String longAddress) {
        //return urlRepository.deleteUrlElementBylongAddress(longAddress);
        return true;
    }

    public UrlElement getUrlElement(String shortAddress) {
        return urlRepository.findByShortAddress(shortAddress);
    }

    public List<UrlElement> getAllUrlElements() {
        List<UrlElement> urlElements = new ArrayList<>();
        urlRepository.findAll()
                .forEach(urlElement -> urlElements.add(urlElement));
        return urlElements;
        //return urlRepository.getAllUrlElements();
    }


}
