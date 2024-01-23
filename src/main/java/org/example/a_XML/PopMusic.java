package org.example.a_XML;

import java.util.ArrayList;
import java.util.List;

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