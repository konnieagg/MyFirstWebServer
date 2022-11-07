package com.academy.webapp.spring.MyFirstWebServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.*;


@Controller
public class myWebsiteController {

    @PostMapping ("/hello")

    public ResponseEntity<String> greetings (@RequestParam String name , String food) {

        return ResponseEntity.ok("Hello "  + name + "! Enjoy your " + food +
                "<form action=\"/\" method=\"GET\">\n" +
                "<button>Back</button>\n" +
                "</form>");

    }
    @GetMapping ("/")

    public ResponseEntity<String> getGreeting () {

        return ResponseEntity.ok("<form action=\"/hello\" method=\"POST\">\n" +
                "<input name=\"name\" placeholder=\"Your name\">\n" +
                "<input name=\"food\" placeholder=\"A meal\">\n" +
                "<button>Go</button>\n" +
                "</form>");

    }

    // Language variable, and controller
    private Language language;
    @Autowired
    public myWebsiteController(Language language) {
        this.language = language;
    }


    // Language GET
    @GetMapping ("/greeting")
    @ResponseBody

    public ResponseEntity<String> getLang (@RequestParam String name , String lang) {
        Counter counter = new Counter();

        return ResponseEntity.ok(language.languageSelector(lang) + name + "! "+ "Times called for " + name + ": " + counter.counter(name));
    }




}
