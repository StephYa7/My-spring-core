package org.example.c_Config;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music {
    List<String> songs = new ArrayList<>();

    public PopMusic() {
        songs.add("pop 1");
        songs.add("pop 2");
        songs.add("pop 3");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}