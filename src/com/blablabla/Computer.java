package com.blablabla;

public class Computer extends MusicPlayer{
    private Music music;

    public Computer(Music music) {
        super(music);
    }

    public void playerOn(){
        playAudio();
    }
}
