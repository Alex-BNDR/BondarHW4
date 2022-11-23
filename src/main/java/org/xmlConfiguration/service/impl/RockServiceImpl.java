package org.xmlConfiguration.service.impl;

import org.springframework.stereotype.Service;
import org.entity.MusicTrack;
import org.xmlConfiguration.service.RockService;

import java.util.List;

@Service
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
