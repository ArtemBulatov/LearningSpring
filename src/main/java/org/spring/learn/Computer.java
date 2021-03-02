package org.spring.learn;

import org.spring.learn.genres.MusicGenre;


public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer id: " + id + " " + musicPlayer.playMusic(MusicGenre.CHRISTIAN_MUSIC);
    }
}
