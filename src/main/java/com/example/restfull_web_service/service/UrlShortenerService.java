package com.example.restfull_web_service.service;

import com.example.restfull_web_service.dao.DataBaseInterface;
import com.example.restfull_web_service.pojo.UrlChanger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class UrlShortenerService {
    private  DataBaseInterface dataBaseInterface;
    private static AtomicLong id;

    static{
        id = new AtomicLong();
        id.set(10);
    }

    public UrlShortenerService(@Qualifier("fakeDB") DataBaseInterface dataBaseInterface) {
        this.dataBaseInterface = dataBaseInterface;
    }

    public UrlChanger getUrlDataByLongUrl(String longUrl) {
        return dataBaseInterface.selectDataByLongURL(longUrl).orElse(null);
    }

    public UrlChanger getUrlDataByShortUrl(String shortUrl) {
        return dataBaseInterface.selectDataByShortURL(shortUrl).orElse(null);
    }



    public String addUrlToDataBase(String longUrl) {
        String template = "krejzi_%d";
        String shortUrl = String.format(template, id.incrementAndGet());
        dataBaseInterface.insertData(new UrlChanger(longUrl, shortUrl));
        return shortUrl;
    }

    public boolean clearDataBase() {
        return dataBaseInterface.deleteAllData();
    }


}
