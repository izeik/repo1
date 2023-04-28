package com.example.dzy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping(value = "/student")
    public String index() {return "stu";}

    @RequestMapping(value = "/message")
    @CrossOrigin(origins = "http://localhost:9090")

    public ResponseEntity<Object> getMessage() {
        return null;
    }
}
