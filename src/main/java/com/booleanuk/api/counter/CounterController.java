package com.booleanuk.api.counter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("counter")
public class CounterController {
    private int counter;

    public CounterController() {
        this.counter = 0;
    }


    @GetMapping()
    public String getCounter() {
        this.counter = 0;
        return "The counter is " + this.counter;
    }

    @GetMapping("/increment")
    public String increment() {
        this.counter += 1;
        return "The counter is " + this.counter;
    }

    @GetMapping("/decrement")
    public String decrement() {
        this.counter -= 1;
        return "The counter is " + this.counter;
    }


}
