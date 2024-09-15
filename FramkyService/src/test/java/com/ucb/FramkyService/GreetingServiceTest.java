package com.ucb.FramkyService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GreetingServiceTest {

    @Autowired
    private GreetingService greetingService;

    @Test
    public void testGetGreetingInSpanish() {
        String expectedMessage = "Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana";
        String actualMessage = greetingService.getGreeting("es");
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testGetGreetingInEnglish() {
        String expectedMessage = "Ask yourself if what you are doing today is getting you closer to the place you want to be tomorrow";
        String actualMessage = greetingService.getGreeting("en");
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testGetPersonalizedGreetingInSpanish() {
        String name = "Fabio";
        String expectedMessage = "Fabio, Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana";
        String actualMessage = greetingService.getPersonalizedGreeting(name, "es");
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testGetPersonalizedGreetingInEnglish() {
        String name = "Fabio";
        String expectedMessage = "Fabio, Ask yourself if what you are doing today is getting you closer to the place you want to be tomorrow";
        String actualMessage = greetingService.getPersonalizedGreeting(name, "en");
        assertEquals(expectedMessage, actualMessage);
    }
}
