package org.example.a_XML;

import lombok.Data;

import java.util.List;
import java.util.Random;
@Data
public class MusicPlayer {
    private List<Music> musics;
    private String name;
    private int volume;

    public MusicPlayer(List<Music> musics) {
        this.musics = musics;
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        Random random = new Random();
        System.out.println(musics.get(random.nextInt(3)).getSong().get(random.nextInt(3)));
    }

    public void initPls() {
        System.out.println("MP was born");
    }

    public void destroyPls() {
        System.out.println("MP was destroy");
    }
}