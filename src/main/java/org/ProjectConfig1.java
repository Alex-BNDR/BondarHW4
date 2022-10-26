package org;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.classic.ClassicMP3;
import org.classic.FirstClassicMP3;
import org.classic.SecondClassicMP3;
import org.classic.ClassicMusicPlayer;
import org.rock.RockMP3;
import org.rock.FirstRockMP3;
import org.rock.SecondRockMP3;
import org.rock.RockMusicPlayer;

@Configuration
public class ProjectConfig1 {

    @Bean
    FirstClassicMP3 firstClassicMP3()
    {
        FirstClassicMP3 firstClassicMP3 = new FirstClassicMP3();
        return firstClassicMP3;
    }

    @Bean
    SecondClassicMP3 secondClassicMP3()
    {
        SecondClassicMP3 secondClassicMP3 = new SecondClassicMP3();
        return secondClassicMP3;
    }

    @Bean
    FirstRockMP3 firstRockMP3()
    {
        FirstRockMP3 firstRockMP3 = new FirstRockMP3();
        return firstRockMP3;
    }

    @Bean
    SecondRockMP3 secondRockMP3()
    {
        SecondRockMP3 secondRockMP3 = new SecondRockMP3();
        return secondRockMP3;
    }

    @Bean
    RockMusicPlayer rockMusicPlayer(AnnotationConfigApplicationContext context)
    {
        RockMusicPlayer rockMusicPlayer = new RockMusicPlayer();

        rockMusicPlayer.addTrackToList(context);
        return rockMusicPlayer;
    }

    @Bean
    ClassicMusicPlayer classicPlayer(AnnotationConfigApplicationContext context)
    {
        ClassicMusicPlayer classicMusicPlayer = new ClassicMusicPlayer();
        classicMusicPlayer.addTrackToList(context);
        return classicMusicPlayer;
    }

}
