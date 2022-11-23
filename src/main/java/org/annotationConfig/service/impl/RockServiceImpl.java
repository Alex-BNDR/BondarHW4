package org.annotationConfig.service.impl;

import org.entity.MusicTrack;
import org.annotationConfig.service.RockService;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

import java.util.Arrays;
import java.util.List;

@Service
public class RockServiceImpl implements RockService {
    private List<MusicTrack> rockTracks;

    @PostConstruct
    public void init() {
        MusicTrack rock1 = new MusicTrack();
        rock1.setTrackName("Nothing else matters");
        rock1.setArtist("Metallica");

        MusicTrack rock2 = new MusicTrack();
        rock2.setTrackName("Wind of change");
        rock2.setArtist("Scorpions");

        rockTracks = Arrays.asList(rock1, rock2);
    }

    @Override
    public void playRockMusic() {
        for (MusicTrack rockTrack : rockTracks) {
            System.out.println(rockTrack);
        }
    }
}
