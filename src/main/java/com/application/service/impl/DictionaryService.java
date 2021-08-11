package com.application.service.impl;

import com.application.dao.impl.DictionaryDAO;
import com.application.service.Service;

public class DictionaryService implements Service {
    private static DictionaryService instance;

    private DictionaryService(){}

    public static DictionaryService getInstance(){
        if(instance == null){
            instance = new DictionaryService();
        }

        return instance;
    }

    public void addWord(String en, String ru){
        DictionaryDAO.getInstance().putWord(en.toLowerCase(), ru.toLowerCase());
    }

    public String getWord(String en){
        String result = "Translate is: " + DictionaryDAO.getInstance().getWord(en.toLowerCase());

        if(result == null){
            result = "There is no word '" + en + "'";
        }
        return result;
    }
}
