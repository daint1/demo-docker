package me.learning.demodocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetingController {
    @GetMapping("/sayHi")
    public String sayHi() {
        return "hello guys";
    }
}
