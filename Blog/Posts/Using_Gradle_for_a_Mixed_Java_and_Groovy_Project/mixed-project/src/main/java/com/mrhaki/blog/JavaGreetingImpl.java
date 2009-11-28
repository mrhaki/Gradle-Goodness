package com.mrhaki.blog;

public class JavaGreetingImpl implements GreetingService {
    public String greet(final String name) {
        return "Hello " + (name != null ? name : "stranger") + ". Greeting from Java.";
    }
}