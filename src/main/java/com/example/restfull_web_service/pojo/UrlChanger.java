package com.example.restfull_web_service.pojo;

public class UrlChanger {
    public UrlChanger(String longUrl, String shortUrl) {
        this.longUrl = longUrl;
        this.shortUrl = shortUrl;
    }
    private final String longUrl;
    private final String shortUrl;

    public String getLongUrl() {
        return longUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }
}
