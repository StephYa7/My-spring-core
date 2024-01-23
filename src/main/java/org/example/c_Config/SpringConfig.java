package org.example.c_Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("org.example.c_Config")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return ClassicalMusic.getInstance();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicListForMusicPlayer());
    }

    @Bean
    public List<Music> musicListForMusicPlayer() {
        List<Music> result = new ArrayList<>();
        result.add(rockMusic());
        result.add(popMusic());
        result.add(classicalMusic());
        return result;
    }


}