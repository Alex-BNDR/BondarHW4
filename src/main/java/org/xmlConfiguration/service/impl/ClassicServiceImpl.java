package org.xmlConfiguration.service.impl;

import org.springframework.stereotype.Service;
import org.entity.MusicTrack;
import org.xmlConfiguration.service.ClassicService;

import java.util.List;

@Service
public class ClassicServiceImpl implements ClassicService {
    private List<MusicTrack> classicTracks;

    public ClassicServiceImpl(List<MusicTrack> classicTracks) {
        this.classicTracks = classicTracks;
    }

    @Override
    public void playClassicMusic() {
        for (MusicTrack classicalTrack : classicTracks) {
            System.out.println(classicalTrack);
        }
    }
}
