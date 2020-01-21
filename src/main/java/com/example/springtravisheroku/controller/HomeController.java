package com.example.springtravisheroku.controller;

import com.example.springtravisheroku.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private PersonService personService;

    @GetMapping(value = "/test")
    public String helloWorld() {
        return "Hello World!";
    }

    @PostMapping(value = "/save")
    public void saveUser(@RequestParam String name) {
        personService.savePerson(name);
    }

    @GetMapping(value = "/getAll")
    public String getUsers() {
        return personService.getAll();
    }
}
