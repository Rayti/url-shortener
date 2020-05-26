package com.example.restfull_web_service.dao;

import com.example.restfull_web_service.pojo.UrlChanger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@Qualifier("fakeDB")
public class FakeDataBaseImpl implements DataBaseInterface {

    private List<UrlChanger> dataBase;

    public FakeDataBaseImpl() {
        this.dataBase = new ArrayList<>();
    }


    @Override
    public Optional<UrlChanger> selectDataByLongURL(String longUrl) {
        return dataBase.stream()
                .filter(element -> element.getLongUrl().equals(longUrl))
                .findFirst();
    }

    @Override
    public Optional<UrlChanger> selectDataByShortURL(String shortUrl) {
        return dataBase.stream()
                .filter(element -> element.getShortUrl().equals(shortUrl))
                .findFirst();
    }

    @Override
    public List<UrlChanger> selectAllData() {
         return dataBase;
    }

    @Override
    public boolean deleteAllData() {
        dataBase.clear();
        return true;
    }

    @Override
    public boolean insertData(UrlChanger urlChanger) {
        if (dataBase.stream()
                .filter(element -> element.getLongUrl().equals(urlChanger.getLongUrl()))
                .findFirst().isEmpty()){
            dataBase.add(urlChanger);
            return true;
        }
        return false;
    }
}
