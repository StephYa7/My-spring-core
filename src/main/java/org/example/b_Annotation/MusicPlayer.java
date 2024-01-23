package org.example.b_Annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;

@Component
@Data
@Scope("prototype")
public class MusicPlayer {
    private List<Music> musics;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(List<Music> musics) {
        this.musics = musics;
    }

    public void playMusic() {
        System.out.println(musics.get(new Random().nextInt(3)).getSong().get(new Random().nextInt(3)));
    }

    @PostConstruct
    public void initPls() {
        System.out.println("MP was born");
    }

    @PreDestroy
    public void destroyPls() {
        System.out.println("MP was destroy");
    }
}