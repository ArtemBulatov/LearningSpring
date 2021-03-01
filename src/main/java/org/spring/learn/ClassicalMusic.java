package org.spring.learn;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Moonlight Sonata";
    }
}
