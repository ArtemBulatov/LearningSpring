package org.spring.learn;

public class ChristianMusic implements Music{

    private ChristianMusic(){}

    public static ChristianMusic getChristianMusic() {
        return new ChristianMusic();
    }

    @Override
    public String getSong() {
        return "Hillsong";
    }

    @Override
    public void initMusic() {
        System.out.println("Christian music's initialization");
    }

    @Override
    public void destroyMusic() {
        System.out.println("Christian music is distroyed");
    }
}
