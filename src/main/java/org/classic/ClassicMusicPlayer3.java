package org.classic;

import java.util.ArrayList;

public class ClassicMusicPlayer3 {

    ArrayList<ClassicMP3> classicTrackList = new ArrayList<>();
    ClassicMP3 firstClassicTrack;
    ClassicMP3 secondClassicTrack;

    public void addTrackToList() {
        classicTrackList.add(firstClassicTrack);
        classicTrackList.add(secondClassicTrack);
    }

    public void playTrack(int numberTrack) {
        System.out.println("Track number " + numberTrack + " is playing now" + "Track information:  " + classicTrackList.get(numberTrack));
    }

    public ArrayList<ClassicMP3> getClassicTrackList() {
        return classicTrackList;
    }

    public void setClassicTrackList(ArrayList<ClassicMP3> classicTrackList) {
        this.classicTrackList = classicTrackList;
    }

    public ClassicMP3 getFirstClassicTrack() {
        return firstClassicTrack;
    }

    public void setFirstClassicTrack(ClassicMP3 firstClassicTrack) {
        this.firstClassicTrack = firstClassicTrack;
    }

    public ClassicMP3 getSecondClassicTrack() {
        return secondClassicTrack;
    }

    public void setSecondClassicTrack(ClassicMP3 secondClassicTrack) {
        this.secondClassicTrack = secondClassicTrack;
    }

    @Override
    public String toString() {
        return "ClassicPlayer{" +
                "classicTrackList=" + classicTrackList +
                ", firstClassicTrack=" + firstClassicTrack +
                ", secondClassicTrack=" + secondClassicTrack +
                '}';
    }
}