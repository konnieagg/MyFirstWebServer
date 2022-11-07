package com.academy.webapp.spring.MyFirstWebServer;

import org.springframework.stereotype.Service;

@Service
public class Language {

    public String languageSelector(String lang){
        if (lang.equals("hun")){
            return "A nevem  ";
        } else if (lang.equals("gr")){
            return "Το όνομά μου είναι ";
        }
        return "My name is ";
    }
}
