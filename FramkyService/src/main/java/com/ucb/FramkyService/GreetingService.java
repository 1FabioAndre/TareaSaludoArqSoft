package com.ucb.FramkyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Value("${greeting.message}")
    private String greetMessage;

    public String getGreeting() {
        return greetMessage;
    }

    public String getPersonalizedGreeting(String name) {
        return String.format("%s, %s", name, greetMessage);
    }
}
