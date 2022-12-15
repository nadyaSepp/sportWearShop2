package com.seppana.sportwearshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Класс головной страницы
@Controller
public class MainController {
    @GetMapping
    public String index() {
        return "index";
    }
}