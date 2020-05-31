package com.example.restfull_web_service.dao;

import com.example.restfull_web_service.pojo.UrlElement;
import com.example.restfull_web_service.service.UrlMenager;
import org.springframework.data.repository.CrudRepository;

public interface UrlRepository extends CrudRepository<UrlElement, Long> {
    UrlElement findByShortAddress(String shortAddress);
}
