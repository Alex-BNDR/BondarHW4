package org.rock;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockMusicPlayer2 {

    ArrayList<RockMP3> rockTrackList = new ArrayList<>();

    @Autowired
    private FirstRockMP3 firstRockTrack = new FirstRockMP3();

    @Autowired
    private SecondRockMP3 secondRockTrack = new SecondRockMP3();

    public void addTrackToList() {
        rockTrackList.add(firstRockTrack);
        rockTrackList.add(secondRockTrack);
    }

    public void playTrack(int numberTrack) {
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