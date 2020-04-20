package com.ajit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/api")
public class CountryController {

    @RequestMapping(name = "/country")
    public String getValue() {
        return "This is test country";

    }


    @RequestMapping(name = "/countries")
    public String getValues() {
        return  "Thisis second commit.";
    }

    @RequestMapping(name = "/coun")
    public String getValuFor() {
        return  "Thisis third commit.";
    }


    @RequestMapping(name = "/country/city")
    public String getValuFors() {
        return  "Thisis fourth  commit.";
    }


}
