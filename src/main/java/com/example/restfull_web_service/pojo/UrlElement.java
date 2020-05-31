package com.example.restfull_web_service.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

@Entity
public class UrlElement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String shortAddress;
    public String longAddress;

    public UrlElement() {
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setShortAddress(String shortAddress) {
        this.shortAddress = shortAddress;
    }

    public void setLongAddress(String longAddress) {
        this.longAddress = longAddress;
    }

    public Long getId() {
        return id;
    }

    public String getShortAddress() {
        return shortAddress;
    }

    public String getLongAddress() {
        return longAddress;
    }
}
