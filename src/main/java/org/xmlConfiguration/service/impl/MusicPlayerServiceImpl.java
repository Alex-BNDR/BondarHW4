package org.xmlConfiguration.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xmlConfiguration.service.ClassicService;
import org.xmlConfiguration.service.MusicPlayerService;
import org.xmlConfiguration.service.RockService;

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
