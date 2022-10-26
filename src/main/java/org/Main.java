package org;

import lombok.*;
import org.classic.ClassicMusicPlayer;
import org.rock.RockMusicPlayer;
import org.rock.RockMusicPlayer2;
import org.classic.ClassicMusicPlayer2;
import org.rock.RockMusicPlayer3;
import org.classic.ClassicMusicPlayer3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args)

    {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Select output method: ");
        System.out.println("1. --->  through AnnotationConfigApplicationContext (ProjectConfig1.java = Method Beans);");
        System.out.println("2. --->  through AnnotationConfigApplicationContext (ProjectConfig2.java = Method ComponentScan);");
        System.out.println("3. --->  through ProjectConfig3.xml.");

        Integer i = in.nextInt();

        switch (i) {
            case 1:
                AnnotationConfigApplicationContext contextApplicationSpring1 = new AnnotationConfigApplicationContext(ProjectConfig1.class);

                ClassicMusicPlayer classicMusicPlayer1 = contextApplicationSpring1.getBean(ClassicMusicPlayer.class);
                RockMusicPlayer rockMusicPlayer1 = contextApplicationSpring1.getBean(RockMusicPlayer.class);

                classicMusicPlayer1.playTrack(0);
                rockMusicPlayer1.playTrack(0);

                break;
            case 2:
                AnnotationConfigApplicationContext contextApplicationSpring2 = new AnnotationConfigApplicationContext(ProjectConfig2.class);

                RockMusicPlayer2 rockMusicPlayer2 = contextApplicationSpring2.getBean(RockMusicPlayer2.class);
                rockMusicPlayer2.addTrackToList();
                rockMusicPlayer2.playTrack(1);

                break;
            case 3: ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ProjectConfig3.xml");

                var rockPlayerBean3 = (RockMusicPlayer3) ac.getBean("rockPlayer");
                rockPlayerBean3.addTrackToList();
                rockPlayerBean3.playTrack(1);

                break;
        }
    }
}