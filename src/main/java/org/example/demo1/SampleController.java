package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/test")
    String someMethod()
    {
        return "Hello World";
    }
    @GetMapping("/getUserData")
    UserData Metoda1()
    {
        return new UserData(1, "Adam", "Małysz");
    }

}