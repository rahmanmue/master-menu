package com.enigmacamp.mastermenu.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello World";
    }
}
