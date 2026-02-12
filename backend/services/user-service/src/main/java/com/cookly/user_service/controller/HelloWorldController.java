package com.cookly.user_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HelloWorldController {

    /**
     * Handles GET requests to the root path and returns a greeting message.
     *
     * @return a simple "Hello World!" string
     */
    @GetMapping
    public String home() {
        return "Hello World!";
    }
}
