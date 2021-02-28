package org.spring.learn;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Rammstein";
    }

    @Override
    public void initMusic() {
        System.out.println("Rock music's initialization");
    }

    @Override
    public void destroyMusic() {
        System.out.println("Rock music is distroyed");
    }
}
