package org.classic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class ClassicMusicPlayer {

    ArrayList<ClassicMP3> classicTrackList = new ArrayList<>();

    public void addTrackToList(AnnotationConfigApplicationContext context) {
        ClassicMP3 firstClassicMP3 = context.getBean(FirstClassicMP3.class);
        ClassicMP3 secondClassicMP3 = context.getBean(SecondClassicMP3.class);
        classicTrackList.add(firstClassicMP3);
        classicTrackList.add(secondClassicMP3);
    }

    public void playTrack (int numberTrack)
    {
        System.out.println("Now track number" + numberTrack + "is playing" + "Track information:  " + classicTrackList.get(numberTrack));
    }

    public ArrayList<ClassicMP3> getClassicTrackList() {
        return classicTrackList;
    }

    public void setClassicTrackList(ArrayList<ClassicMP3> classicTrackList) {
        this.classicTrackList = classicTrackList;
    }

    @Override
    public String toString() {
        return "ClassicPlayer{" +
                "classicTrackList=" + classicTrackList +
                '}';
    }


}
