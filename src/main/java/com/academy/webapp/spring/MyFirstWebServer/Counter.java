package com.academy.webapp.spring.MyFirstWebServer;

import org.springframework.stereotype.Service;

@Service
public class Counter {

    public int counter(String name){
        int counter = 0;
        return counter + 1;
    }
}
