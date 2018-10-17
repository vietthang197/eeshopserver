package com.levietthang.eeshopserver.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(basePackages = {"com.levietthang.eeshopserver", "com.levietthang.eeshopserver.rest"})
@RequestMapping("/")
public class HomeController {
    @GetMapping
    @ResponseBody
    public String getHome() {
        return "index";
    }
}
