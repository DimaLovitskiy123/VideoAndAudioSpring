package com.blablabla;

public class ClassicMusic implements Music{
    private int volume = 10;

    public ClassicMusic(int volume){
        this.volume = volume;
    }

    @Override
    public String returnSong(){
        return "Лунная соната";
    }
}
