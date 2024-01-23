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
        songs.add("classic 1");
        songs.add("classic 2");
        songs.add("classic 3");
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