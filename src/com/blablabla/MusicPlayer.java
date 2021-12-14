package com.blablabla;

public class MusicPlayer implements IMusicPlayer{
    private Music music;

    public MusicPlayer(Music music){
        this.music = music;
    }

    public void playAudio(){
        System.out.println(music.returnSong());
    }
}
