package org.javaConfiguration.service.impl;

import org.entity.MusicTrack;
import org.javaConfiguration.service.RockService;


import java.util.List;


public class RockServiceImpl implements RockService {
    private List<MusicTrack> rockTracks;

    public RockServiceImpl(List<MusicTrack> rockTracks) {
        this.rockTracks = rockTracks;
    }

    @Override
    public void playRockMusic() {
        for (MusicTrack rockTrack : rockTracks) {
            System.out.println(rockTrack);
        }
    }
}
