package org.rock;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class RockMusicPlayer {

    ArrayList<RockMP3> rockTrackList = new ArrayList<>();

    public void addTrackToList(AnnotationConfigApplicationContext context) {
        RockMP3 firstRockMP3 = context.getBean(FirstRockMP3.class);
        RockMP3 secondRockMP3 = context.getBean(SecondRockMP3.class);
        rockTrackList.add(firstRockMP3);
        rockTrackList.add(secondRockMP3);
    }

    public void playTrack (int numberTrack)
    {
        System.out.println("Now track number" + numberTrack + "is playing" + "Track information:  " + rockTrackList.get(numberTrack));
    }

    public ArrayList<RockMP3> getRockTrackList() {
        return rockTrackList;
    }

    public void setRockTrackList(ArrayList<RockMP3> rockTrackList) {
        this.rockTrackList = rockTrackList;
    }

    @Override
    public String toString() {
        return "RockPlayer{" +
                "rockTrackList=" + rockTrackList +
                '}';
    }

}
