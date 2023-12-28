package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class MusicPlayer {
    //    private List<Music> musicList = new ArrayList<>();
    @Autowired
    private ClassicalMusic music;
    private String name;
    private int volume;

    public MusicPlayer(ClassicalMusic music) {
        this.music = music;
//        this.musicList = musicList;
    }

    public MusicPlayer() {
    }

    public String playMusic() {
//        for (Music music : musicList) {
        return "Playing: " + music.getSong() + " " + music.hashCode();
//        }
    }

    public void initPls() {
        System.out.println("MP was born");
    }

    public void destroyPls() {
        System.out.println("MP was destroy");
    }

}