package org.javaConfiguration;

import org.javaConfiguration.service.MusicPlayerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.javaConfiguration");
        MusicPlayerService musicPlayerService = applicationContext.getBean(MusicPlayerService.class);
        musicPlayerService.playClassicMusic();
        musicPlayerService.playRockMusic();
    }
}
