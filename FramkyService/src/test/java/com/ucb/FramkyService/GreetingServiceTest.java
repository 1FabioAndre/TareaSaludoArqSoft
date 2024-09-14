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
    public void testGetGreeting() {
        String expectedMessage = "Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana";
        String actualMessage = greetingService.getGreeting();
        assertEquals(expectedMessage, actualMessage);
    }
}
