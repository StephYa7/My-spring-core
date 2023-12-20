package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Music music = context.getBean("musicBean", Music.class);
//        Music music2 = context.getBean("musicBean2", Music.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        System.out.println("------------------------");

        MusicPlayer musicPlayer2 = context.getBean("musicPlayer2", MusicPlayer.class);
        musicPlayer2.playMusic();
        System.out.println(musicPlayer2.getName());
        System.out.println(musicPlayer2.getVolume());

        context.close();





    }
}