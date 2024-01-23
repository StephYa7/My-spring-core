package org.example.b_Annotation;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music {
    List<String> songs = new ArrayList<>();

    public PopMusic() {
        songs.add("ABBA - S.O.S.");
        songs.add("Lady Gaga - Wrecking ball");
        songs.add("Wham - Last Christmas");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}