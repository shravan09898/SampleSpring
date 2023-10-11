package com.example.SampleSpring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // GET Call /hello -> Hello World with http status code 200 OK
    @GetMapping("/hello")
    public ResponseEntity helloWorld(){
        String hello = "Hello World!";

        Person p1 = new Person("Shravan", 25, "Hello Everyone!");

        return ResponseEntity.ok(p1);
    }
}
