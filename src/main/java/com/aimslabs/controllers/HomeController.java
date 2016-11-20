package com.aimslabs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sayemkcn on 11/9/16.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String sayHello() {
        return "index";
    }
}
