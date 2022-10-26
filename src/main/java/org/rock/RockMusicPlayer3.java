package org.rock;

import java.util.ArrayList;

public class RockMusicPlayer3 {

    ArrayList<RockMP3> rockTrackList = new ArrayList<>();
    RockMP3 firstRockTrack;
    RockMP3 secondRockTrack;

    public void addTrackToList() {
        rockTrackList.add(firstRockTrack);
        rockTrackList.add(secondRockTrack);
    }

    public void playTrack(int numberTrack) {
        System.out.println("Track number " + numberTrack + " is playing now " + "Track information:  " + rockTrackList.get(numberTrack));
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

    public RockMP3 getFirstRockTrack() {
        return firstRockTrack;
    }

    public void setFirstRockTrack(RockMP3 firstRockTrack) {
        this.firstRockTrack = firstRockTrack;
    }

    public RockMP3 getSecondRockTrack() {
        return secondRockTrack;
    }

    public void setSecondRockTrack(RockMP3 secondRockTrack) {
        this.secondRockTrack = secondRockTrack;
    }
}