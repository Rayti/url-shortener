package com.example.restfull_web_service.service;

import com.example.restfull_web_service.pojo.UrlElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public final class UrlMenager {

    private  UrlConverter urlConverter;

    public UrlMenager(@Qualifier("simpleConverter")UrlConverter urlConverter) {
        this.urlConverter = urlConverter;
    }


    public  final UrlElement generateUrlElem(String longAddress) {
        UrlElement urlElement = new UrlElement();
        urlElement.setLongAddress(longAddress);
        urlElement.setShortAddress(urlConverter.convertToShortAddress(longAddress));
        return urlElement;
    }
}
