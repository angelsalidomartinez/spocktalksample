package com.angel.spock.spocktalksample.controller;

import com.angel.spock.spocktalksample.greeting.Greeting;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GreetingControllerTest {

    @Test
    public void testGreeting(){
        GreetingController greetingController = new GreetingController();
        Greeting greetingResult = greetingController.greeting("angel","hello world");

        Assert.assertNotNull(greetingResult);
        Assert.assertEquals(greetingResult.getName(),"angel");
        Assert.assertEquals(greetingResult.getMessage(), "hello world");
    }

}