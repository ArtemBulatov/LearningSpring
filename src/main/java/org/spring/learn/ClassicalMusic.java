package org.spring.learn;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Moonlight Sonata";
    }

    @Override
    public void initMusic() {
        System.out.println("Classical music's initialization");
    }

    @Override
    public void destroyMusic() {
        System.out.println("Classical music is distroyed");
    }

}
