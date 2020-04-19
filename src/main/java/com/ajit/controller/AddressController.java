package com.ajit.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api")
@RestController
public class AddressController {

    @GetMapping(value = "/test")
    public String getValue() {
        return "Hello API";
    }
}
