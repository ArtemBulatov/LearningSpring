package org.spring.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("classicalMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music1 = context.getBean("rockMusic", Music.class);
        musicPlayer = new MusicPlayer(music1);
        musicPlayer.playMusic();

        Music music2 = context.getBean("christianMusic", Music.class);
        musicPlayer = new MusicPlayer(music2);
        musicPlayer.playMusic();

        context.close();
    }
}
