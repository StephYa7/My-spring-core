package org.example.a_XML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_a.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.playMusic();
        musicPlayer.playMusic();
        musicPlayer.playMusic();


        List<Music> musicList = new ArrayList<>();
        musicList.add(ClassicalMusic.getInstance());
        musicList.add(new RockMusic());
        musicList.add(new PopMusic());

        System.out.println("------------1-----------");
        Music music1 = context.getBean("musicBean11", PopMusic.class);
        Music music2 = context.getBean("musicBean12", RockMusic.class);

        System.out.println("------------2-----------");
        musicPlayer.setMusics(musicList);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
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