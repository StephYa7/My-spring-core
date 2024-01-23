package org.example.c_Config;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    List<String> songs = new ArrayList<>();

    public RockMusic() {
        songs.add("rock 1");
        songs.add("rock 2");
        songs.add("rock 3");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}