package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    MyService myService;

    @Autowired
    public Controller(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/result")
    public String getCounterLetters() {
        return myService.getResult();
    }
}
