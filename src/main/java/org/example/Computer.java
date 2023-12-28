package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Data
@Component
public class Computer {
    private int id;
    @Autowired
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer player) {
        this.id = 1;
        this.musicPlayer = player;
    }

    @Override
    public String toString() {
        return "PC" + id + " " + musicPlayer.playMusic();
    }
}