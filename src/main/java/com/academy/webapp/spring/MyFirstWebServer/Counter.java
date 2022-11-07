package com.academy.webapp.spring.MyFirstWebServer;

import org.springframework.stereotype.Service;

@Service
public class Counter {
    private static Integer counter = 0;
    public static int counter(){

        return counter += 1;
    }
}
