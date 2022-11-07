package com.academy.webapp.spring.MyFirstWebServer;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.*;


@Controller
public class myWebsiteController {

    @GetMapping("/hello")
    public ResponseEntity<String> greetings (@RequestParam String name , String food) {

        return ResponseEntity.ok("Hello "  + name + "! Enjoy your " + food);

    }

// comment test
// Test Daniellll
}
