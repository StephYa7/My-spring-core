package org.example.b_Annotation;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    List<String> songs = new ArrayList<>();

    public RockMusic() {
        songs.add("Freak On A Leash");
        songs.add("I disappear");
        songs.add("A.D.I.D.A.S.");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}