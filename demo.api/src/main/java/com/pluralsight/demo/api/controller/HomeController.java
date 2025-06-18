package com.pluralsight.demo.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

//    @RequestMapping(path = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "Sir ") String name){
        return "Hello " + name;

    }
}
