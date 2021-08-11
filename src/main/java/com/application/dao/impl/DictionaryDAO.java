package com.application.dao.impl;

import com.application.dao.DAO;

import java.util.Collections;
import java.util.HashMap;

public class DictionaryDAO implements DAO {
    private HashMap<String, String> dictionary = new HashMap<>(){{
        put("car", "машина");
        put("ocean", "океан");
        put("sea", "море");
        put("sand", "песок");
        put("cat", "кот");
        put("dog", "собака");
        put("ball", "мяч");
        put("toy", "игрушка");
        put("bear", "медведь");
        put("moon", "луна");
    }};

    private static DictionaryDAO instance;

    private DictionaryDAO(){}

    public static DictionaryDAO getInstance(){
        if(instance == null){
            instance = new DictionaryDAO();
        }

        return instance;
    }

    @Override
    public void putWord(String en, String ru) {
        dictionary.put(en, ru);
    }

    @Override
    public String getWord(String en) {
        return dictionary.get(en);
    }
}
