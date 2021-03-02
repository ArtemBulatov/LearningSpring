package org.spring.learn.genres;

import org.spring.learn.Music;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ChristianMusic implements Music {
    private final List<String> christianMusicList = new ArrayList<>();

    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    "src/main/java/org/spring/learn/musics/ChristianMusics.txt"));

            while (reader.ready()) {
                christianMusicList.add(reader.readLine());
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }

    @Override
    public List<String> getSongs() {
        return christianMusicList;
    }
}
