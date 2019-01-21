package com.angel.spock.spocktalksample.controller

import com.angel.spock.spocktalksample.greeting.Greeting
import spock.lang.Specification


class GreetingControllerSpec extends Specification {

    void "return a greeting object with values name angel and message hello world if the parameters are angel and hello world"(){
        given:
        GreetingController greetingController = new GreetingController()
        when:
        Greeting greeting = greetingController.greeting("angel","hello world")
        then:
        greeting
        "angel" == greeting.name
        "hello world" == greeting.message
    }

}
