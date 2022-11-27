package org.javaConfiguration.service.impl;

import org.javaConfiguration.service.ClassicService;
import org.javaConfiguration.service.MusicPlayerService;
import org.javaConfiguration.service.RockService;
import org.springframework.context.annotation.Primary;



@Primary
public class MusicPlayerServiceImpl implements MusicPlayerService {
    private final ClassicService classicService;
    private final RockService rockService;


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
