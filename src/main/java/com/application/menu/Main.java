package com.application.menu;

import com.application.service.impl.DictionaryService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRun = true;
        String en, ru;

        while (isRun){
            menuMessage();

            String answer = Input.getInstance().execute();

            switch (answer){
                case ("0"):
                    System.out.println("Goodbye!");
                    isRun = false;
                    break;
                case ("1"):
                    getTranslateMessage();

                    en = Input.getInstance().execute();

                    System.out.println(DictionaryService.getInstance().getWord(en));
                    break;
                case ("2"):
                    addTranslate();

                    en = Input.getInstance().execute();
                    ru = Input.getInstance().execute();

                    DictionaryService.getInstance().addWord(en, ru);
                    break;
                default:
                    System.out.println("incorrect input!");
            }
        }
    }

    private static void menuMessage(){
        System.out.println("0. Exit\n1. get translate\n2. add translate");
    }

    private static void getTranslateMessage(){
        System.out.println("Input word on english:");
    }

    private static void addTranslate(){
        System.out.println("Input word on english, then word on russian:");
    }

}
