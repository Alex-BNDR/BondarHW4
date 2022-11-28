package org.javaConfiguration.mainConfig;

import org.javaConfiguration.service.RockService;
import org.javaConfiguration.service.impl.ClassicServiceImpl;
import org.javaConfiguration.service.impl.RockServiceImpl;
import org.javaConfiguration.service.impl.MusicPlayerServiceImpl;
import org.entity.MusicTrack;
import org.javaConfiguration.service.ClassicService;
import org.javaConfiguration.service.MusicPlayerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.javaConfiguration")
public class MainConfig {
    @Bean
    public MusicTrack classic1() {
        MusicTrack classic1 = new MusicTrack();
        classic1.setTrackName("Nucturn 2");
        classic1.setArtist("Shopen");
        return classic1;
    }

    @Bean
    public MusicTrack classic2() {
        MusicTrack classic2 = new MusicTrack();
        classic2.setTrackName("Симфония номер 5");
        classic2.setArtist("Бетховен");
        return classic2;
    }

    @Bean
    public MusicTrack rock1() {
        MusicTrack rock1 = new MusicTrack();
        rock1.setTrackName("Nothing else matters");
        rock1.setArtist("Metallica");
        return rock1;
    }

    @Bean
    public MusicTrack rock2() {
        MusicTrack rock2 = new MusicTrack();
        rock2.setTrackName("Wind of change");
        rock2.setArtist("Scorpions");
        return rock2;
    }

    @Bean
    public List<MusicTrack> classicTracks() {
        return Arrays.asList(classic1(), classic2());
    }

    @Bean
    public List<MusicTrack> rockTracks() {
        return Arrays.asList(rock1(), rock2());
    }

    @Bean
    public ClassicService classicService() {
        return new ClassicServiceImpl(classicTracks());
    }

    @Bean
    public RockService rockService() {
        return new RockServiceImpl(rockTracks());
    }

    @Bean
    public MusicPlayerService musicPlayerService() {
        return new MusicPlayerServiceImpl(classicService(), rockService());
    }
}
