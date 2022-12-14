package com.academy.webapp.spring.MyFirstWebServer;

import org.springframework.stereotype.Service;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Override
    public String languageSelector(String lang){
        if (lang.equals("hun")){
            return "A nevem  ";
        } else if (lang.equals("gr")){
            return "Το όνομά μου είναι ";
        }
        return "My name is ";
    }
    @Override
    public String languageSelectorTimes(String lang){
        if (lang.equals("hun")){
            return "Próbálkozások száma erre a névre ";
        } else if (lang.equals("gr")){
            return "Φορές για ";
        }
        return "Times called for ";
    }
}
