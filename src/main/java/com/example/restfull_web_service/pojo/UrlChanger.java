package com.example.restfull_web_service.pojo;

public class UrlChanger {
    public UrlChanger(String longUrl, String shortUrl) {
        this.longUrl = longUrl;
        this.shortUrl = shortUrl;
    }

    public UrlChanger() {
    }

    private  String longUrl;
    private  String shortUrl;

    public String getLongUrl() {
        return longUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }
}
