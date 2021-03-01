package org.spring.learn;

import org.springframework.stereotype.Component;

@Component
public class ChristianMusic implements Music{
    @Override
    public String getSong() {
        return "Hillsong";
    }
}
