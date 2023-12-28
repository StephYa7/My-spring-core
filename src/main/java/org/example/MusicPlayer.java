package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Data
@Scope("prototype")
public class MusicPlayer {
    @Autowired
    @Qualifier("classicalMusic")
    private Music classicMusic;
    @Autowired
    @Qualifier("rockMusic")
    private Music rockMusic;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer() {
    }

    public void playMusic(MusicEnum musicEnum) {
        if (musicEnum == MusicEnum.CLASSICAL) {
            System.out.println("Playing: " + classicMusic.getSong().get(new Random().nextInt(3))
                    + " " + classicMusic.getSong());
        } else if (musicEnum == MusicEnum.ROCK) {
            System.out.println("Playing: " + rockMusic.getSong().get(new Random().nextInt(3))
                    + " " + rockMusic.getSong());
        }
    }
    public void initPls() {
        System.out.println("MP was born");
    }
    public void destroyPls() {
        System.out.println("MP was destroy");
    }
}