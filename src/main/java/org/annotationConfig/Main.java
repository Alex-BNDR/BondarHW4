package org.annotationConfig;

import org.annotationConfig.service.MusicPlayerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.annotationConfig");
        MusicPlayerService musicPlayerService = applicationContext.getBean(MusicPlayerService.class);
        musicPlayerService.playClassicMusic();
        musicPlayerService.playRockMusic();
    }
}
