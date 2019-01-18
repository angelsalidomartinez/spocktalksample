package com.angel.spock.spocktalksample.controller;

import com.angel.spock.spocktalksample.greeting.Greeting;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    public Greeting greeting(@RequestParam(value = "name",defaultValue = "tu") String name, @RequestParam(value = "message",defaultValue = "hello") String message){
        return new Greeting(counter.incrementAndGet(),name,message);
    }

}
