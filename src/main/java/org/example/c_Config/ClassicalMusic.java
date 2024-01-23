package org.example.c_Config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")

public class ClassicalMusic implements Music {
    List<String> songs = new ArrayList<>();

    private ClassicalMusic() {
        songs.add("Moonlight sonata");
        songs.add("The hall of the mountain king");
        songs.add("Palladio");
    }

    public static ClassicalMusic getInstance() {
        return new ClassicalMusic();
    }

//    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

//    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

    public List<String> getSong() {
        return songs;
    }

}