package org.selfproject.webservice.springboot.web;

import org.selfproject.webservice.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam(name = "name") String name, @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
}
