package com.mrhaki.blog;

import static org.junit.Assert.*;
import org.junit.Test;

public class JavaGreetingTest {
    final GreetingService service = new JavaGreetingImpl();

    @Test public void testGreet() {
        assertEquals("Hello mrhaki. Greeting from Java.", service.greet("mrhaki"));
    }
    
    @Test public void testGreetNull() {
        assertEquals("Hello stranger. Greeting from Java.", service.greet(null));
    }
}