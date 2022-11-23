package org.xmlConfiguration;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xmlConfiguration.service.MusicPlayerService;

public class Main {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("annotationConfiguration.xml");
        MusicPlayerService musicPlayerService = (MusicPlayerService) beanFactory.getBean("musicPlayerServiceBean");
        musicPlayerService.playClassicMusic();
        musicPlayerService.playRockMusic();
    }
}
