package com.restful.webservices.restful.controller;


import com.restful.webservices.restful.models.HelloWorldModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String hello(){
        return "Hi syam Welcome";
    }

    @GetMapping(path = "/helloworld")
    public HelloWorldModel helloWorldModel(){
        return new HelloWorldModel("This is an object");
    }

    @GetMapping(path = "/helloworldpath/{name}")
    public HelloWorldModel helloWorldModelPath(@PathVariable String name){
        return new HelloWorldModel(String.format("Hi %s",name));
    }

}
