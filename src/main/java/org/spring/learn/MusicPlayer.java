package org.spring.learn;

import org.spring.learn.genres.ChristianMusic;
import org.spring.learn.genres.ClassicalMusic;
import org.spring.learn.genres.MusicGenre;
import org.spring.learn.genres.RockMusic;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private final Music classicalMusic;
    private final Music christianMusic;
    private final Music rockMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, ChristianMusic christianMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.christianMusic = christianMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(MusicGenre genre){
        String resultMusic = "Music is not found. Try again.";

        switch (genre) {
            case CLASSICAL_MUSIC:
                resultMusic = randomMusic(classicalMusic.getSongs());
                break;
            case CHRISTIAN_MUSIC:
                resultMusic = randomMusic(christianMusic.getSongs());
                break;
            case ROCK_MUSIC:
                resultMusic = randomMusic(rockMusic.getSongs());
                break;
        }

        return this.name + "\nPlaying: " + resultMusic + " with volume " + this.volume;
    }

    public static String randomMusic(List<String> musicList) {
        int indexOfMusic = (int) (Math.random() * musicList.size());
        return musicList.get(indexOfMusic);
    }
}
