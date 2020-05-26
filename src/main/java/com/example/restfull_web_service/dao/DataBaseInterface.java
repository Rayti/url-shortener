package com.example.restfull_web_service.dao;

import com.example.restfull_web_service.pojo.UrlChanger;

import java.util.List;
import java.util.Optional;

public interface DataBaseInterface {

    Optional<UrlChanger> selectDataByLongURL(String longUrl);

    Optional<UrlChanger> selectDataByShortURL(String shortUrl);

    List<UrlChanger> selectAllData();

    boolean deleteAllData();

    boolean insertData(UrlChanger urlChanger);

}
