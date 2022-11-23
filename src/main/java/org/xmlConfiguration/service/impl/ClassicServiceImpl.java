package org.xmlConfiguration.service.impl;

import org.springframework.stereotype.Service;
import org.entity.MusicTrack;
import org.xmlConfiguration.service.ClassicService;

import java.util.List;

public class ClassicServiceImpl implements ClassicService {
    private final List<MusicTrack> classicTracks;

    public ClassicServiceImpl(List<MusicTrack> classicTracks) {
        this.classicTracks = classicTracks;
    }

    @Override
    public void playClassicMusic() {
        for (MusicTrack classicTrack: classicTracks) {
            System.out.println(classicTrack);
        }
    }
}
