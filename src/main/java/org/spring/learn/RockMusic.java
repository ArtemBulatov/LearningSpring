package org.spring.learn;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class RockMusic implements Music {
    private final List<String> rockMusicList = new ArrayList<>();

    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\artem\\IdeaProjects\\LearningSpring\\src\\main\\java\\org\\spring\\learn\\RockMusics.txt"));
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
