package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong() + " " + music.hashCode());
        }
    }
}