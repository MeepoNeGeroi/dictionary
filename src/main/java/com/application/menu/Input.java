package com.application.menu;

import java.util.Scanner;

public class Input {
    private static Input instance;
    private Scanner sc = new Scanner(System.in);

    private Input(){}

    public static Input getInstance(){
        if(instance == null){
            instance = new Input();
        }

        return instance;
    }

    public String execute(){
        return sc.next();
    }
}
