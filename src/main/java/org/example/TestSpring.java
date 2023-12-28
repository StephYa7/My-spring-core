package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Computer computer = context.getBean("computer",Computer.class);
//        System.out.println(context.toString());

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();



//        List<Music> musicList = new ArrayList<>();
//        musicList.add(ClassicalMusic.getInstance());
//        musicList.add(new RockMusic());
//        musicList.add(new PopMusic());

//        Music music1 = context.getBean("classicalMusic", ClassicalMusic.class);
//        Music music2 = context.getBean("classicalMusic", ClassicalMusic.class);
//        System.out.println(music1 == music2);
//        System.out.println(music1.hashCode());
//        System.out.println(music2.hashCode());

//        musicPlayer.setMusicList(musicList);
//        System.out.println("------------1-----------");
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        System.out.println("------------2-----------");
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic(MusicEnum.CLASSICAL);
//        musicPlayer2.playMusic(MusicEnum.ROCK);
//        System.out.println(musicPlayer2.getName());
//        System.out.println(musicPlayer2.getVolume());
//
//        System.out.println("------------3-----------");
//        System.out.println(musicPlayer.hashCode());
//        System.out.println(musicPlayer2.hashCode());
//        System.out.println(musicPlayer==musicPlayer2);
//        System.out.println(musicPlayer.equals(musicPlayer2));
        context.close();

    }
}