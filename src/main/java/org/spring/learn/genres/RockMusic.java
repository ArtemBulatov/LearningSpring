package org.spring.learn.genres;

import org.spring.learn.Music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music {
    private final List<String> rockMusicList = new ArrayList<>();

    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    "src/main/java/org/spring/learn/musics/RockMusics.txt"));
            while (reader.ready()) {
                rockMusicList.add(reader.readLine());
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }

    @Override
    public List<String> getSongs() {
        return rockMusicList;
    }

    @PostConstruct
    private void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    private void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

}
