package org.example.c_Config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) throws InterruptedException {

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_a.xml");
        Computer computer = context.getBean("computer", Computer.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.playMusic();
        musicPlayer.playMusic();
        musicPlayer.playMusic();


//        List<Music> musicList = new ArrayList<>();
//        musicList.add(ClassicalMusic.getInstance());
//        musicList.add(new RockMusic());
//        musicList.add(new PopMusic());

//        Music music1 = context.getBean("a", ClassicalMusic.class);
//        Music music2 = context.getBean("classicalMusic", ClassicalMusic.class);

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

//        System.out.println("------------3-----------");
//        System.out.println(musicPlayer.hashCode());
//        System.out.println(musicPlayer2.hashCode());
//        System.out.println(musicPlayer == musicPlayer2);
//        System.out.println(musicPlayer.equals(musicPlayer2));
        context.close();

    }
}