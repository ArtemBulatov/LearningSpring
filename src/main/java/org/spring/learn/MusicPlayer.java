package org.spring.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private ChristianMusic christianMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, ChristianMusic christianMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.christianMusic = christianMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(){
        return "\n" + "Playing: " + classicalMusic.getSong() + "\n" + "Playing: " + christianMusic.getSong() + "\n" + "Playing: " + rockMusic.getSong();
    }
}
