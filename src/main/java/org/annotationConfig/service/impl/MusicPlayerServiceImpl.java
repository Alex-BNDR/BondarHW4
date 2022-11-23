package org.annotationConfig.service.impl;

import org.annotationConfig.service.ClassicService;
import org.annotationConfig.service.MusicPlayerService;
import org.annotationConfig.service.RockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicPlayerServiceImpl implements MusicPlayerService {
    private final ClassicService classicService;
    private final RockService rockService;

    @Autowired
    public MusicPlayerServiceImpl(ClassicService classicService,
                                  RockService rockService) {
        this.classicService = classicService;
        this.rockService = rockService;
    }

    @Override
    public void playClassicMusic() {
        classicService.playClassicMusic();
    }

    @Override
    public void playRockMusic() {
        rockService.playRockMusic();
    }
}
