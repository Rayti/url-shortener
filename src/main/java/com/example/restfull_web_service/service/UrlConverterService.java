package com.example.restfull_web_service.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
@Qualifier("simpleConverter")
public class UrlConverterService implements UrlConverter {

    private static AtomicLong atomicLong = new AtomicLong(10);

    @Override
    public String convertToShortAddress(String longAddress) {
        if(longAddress.isBlank() || longAddress.isEmpty()) throw new IllegalArgumentException("Wrong Address!");
        String shortAddress = longAddress.length() >= 3 ? longAddress.substring(0, 3) : longAddress;
        return shortAddress + atomicLong.incrementAndGet();
    }

}
