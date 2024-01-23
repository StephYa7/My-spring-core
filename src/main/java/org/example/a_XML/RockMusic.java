package org.example.a_XML;

import java.util.ArrayList;
import java.util.List;

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