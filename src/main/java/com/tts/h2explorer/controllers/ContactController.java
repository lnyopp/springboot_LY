package com.tts.h2explorer.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {
    @RequestMapping("/contact")
    public String index() {
        return "/pages/contact.html";
    }
}