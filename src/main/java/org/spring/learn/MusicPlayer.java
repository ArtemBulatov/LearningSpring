package org.spring.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {
    private Music classicalMusic;
    private Music christianMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, ChristianMusic christianMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.christianMusic = christianMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(MusicGenre genre){
        String resultMusic = "Music is not found. Try again.";

        switch (genre) {
            case ROCK_MUSIC:
                resultMusic = randomMusic(classicalMusic.getSongs());
                break;
            case CHRISTIAN_MUSIC:
                resultMusic = randomMusic(christianMusic.getSongs());
                break;
            case CLASSICAL_MUSIC:
                resultMusic = randomMusic(rockMusic.getSongs());
                break;
        }

        return "\nPlaying: " + resultMusic;
    }

    public static String randomMusic(List<String> musicList) {
        int indexOfMusic = (int) (Math.random() * musicList.size());
        return musicList.get(indexOfMusic);
    }
}
