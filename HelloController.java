package com.example.hello;
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayhello(){
        return "hello world";
    }

}
