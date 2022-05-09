package com.example.diplom.diplom.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationsController {

    @GetMapping("/registrations")
    public String getPageRegistration() {
        return "account/registrations";
    }
}
