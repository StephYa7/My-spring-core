package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Data
@Component
public class MusicPlayer {
    //    private List<Music> musicList = new ArrayList<>();
    @Autowired
    @Qualifier("classicalMusic")
    private Music classicMusic;
    @Autowired
    @Qualifier("rockMusic")
    private Music rockMusic;
    private String name;
    private int volume;

    public MusicPlayer() {
//        this.music = music;
//        this.musicList = musicList;
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