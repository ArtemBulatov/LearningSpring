package org.spring.learn;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private final List<String> classicalMusicList = new ArrayList<>();
    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\artem\\IdeaProjects\\LearningSpring\\src\\main\\java\\org\\spring\\learn\\ClassicalMusics.txt"));
            while (reader.ready()) {
                classicalMusicList.add(reader.readLine());
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
    @Override
    public List<String> getSongs() {
        return classicalMusicList;
    }
}
