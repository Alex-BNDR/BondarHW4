package org.annotationConfig.service.impl;

import org.entity.MusicTrack;
import org.annotationConfig.service.ClassicService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Service
public class ClassicServiceImpl implements ClassicService {
    private List<MusicTrack> classicTracks;

    @PostConstruct
    public void init() {
        MusicTrack classic1 = new MusicTrack();
        classic1.setTrackName("Nucturn 2");
        classic1.setArtist("Shopen");

        MusicTrack classic2 = new MusicTrack();
        classic2.setTrackName("Симфония номер 5");
        classic2.setArtist("Бетховен");

        classicTracks = Arrays.asList(classic1, classic2);
    }

    @Override
    public void playClassicMusic() {
        for (MusicTrack classicalTrack : classicTracks) {
            System.out.println(classicalTrack);
        }
    }
}
