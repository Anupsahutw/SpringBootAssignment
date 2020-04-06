package com.tw.restdemo.controller;

import com.tw.restdemo.vo.Greeting;
import com.tw.restdemo.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {

    @Autowired
    Greeting greeting;

    @GetMapping("/hello")
    public String hello() {
        return "Hi welcome to springboot";
    }

    @GetMapping("/helloName")
    public String hello(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {
        return "Hi welcome to springboot, " + name;
    }

    @GetMapping("/helloUser")
    public String hello(@RequestBody User user) {
        return "Hi welcome to springboot, " + user.getName();
    }


    @GetMapping(value = "/helloUserGreeting")
    public Greeting helloGreeting(@RequestBody User user) {
        Greeting greeting = new Greeting();
        greeting.setContent("Hi welcome to springboot, " + user.getName());
        return greeting;
    }

    @PostMapping("/greeting")
    public String createGreeting(@RequestParam(value = "message", defaultValue = "UNKNOWN") String message) {
        greeting.setCustomMessage(message);

        return "Success!";
    }

    @GetMapping("/greeting")
    public String getGreeting() {

        return greeting.getContent();
    }

}
