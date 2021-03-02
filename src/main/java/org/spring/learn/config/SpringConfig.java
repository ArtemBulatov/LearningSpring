package org.spring.learn.config;

import org.spring.learn.Computer;
import org.spring.learn.MusicPlayer;
import org.spring.learn.genres.ChristianMusic;
import org.spring.learn.genres.ClassicalMusic;
import org.spring.learn.genres.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public ChristianMusic christianMusic(){
        return new ChristianMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(classicalMusic(), christianMusic(), rockMusic());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

}
