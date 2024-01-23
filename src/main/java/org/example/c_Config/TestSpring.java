package org.example.c_Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) throws InterruptedException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Computer computer = context.getBean("computer", Computer.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();
        musicPlayer.playMusic();
        musicPlayer.playMusic();
        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println("------------1-----------");
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        System.out.println("------------2-----------");
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer2.getName());
        System.out.println(musicPlayer2.getVolume());

        System.out.println("------------3-----------");
        System.out.println(musicPlayer.hashCode());
        System.out.println(musicPlayer2.hashCode());
        System.out.println(musicPlayer == musicPlayer2);
        System.out.println(musicPlayer.equals(musicPlayer2));
        context.close();

    }
}