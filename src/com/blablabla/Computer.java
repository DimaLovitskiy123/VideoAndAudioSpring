package com.blablabla;

public class Computer implements IMusicPlayer{
    private Music music;

    public Computer(Music music) {
        super(music);
    }

    @Override
    public void playAudio() {

    }

    public void playerOn(){
        playAudio();
    }
}
