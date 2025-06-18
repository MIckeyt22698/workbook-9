package com.pluralsight.northwindtraders.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    //    @RequestMapping(path = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "Random Place ") String country){
        return "Hello " + country;

    }
}
