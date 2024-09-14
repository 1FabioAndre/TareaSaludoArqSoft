package com.ucb.FramkyService;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    String greet = "Preguntate si lo que estas haciendo hoy te acerca a lo que quieres hacer mañana";

    public String getGreeting(){
        return greet;
    }
}