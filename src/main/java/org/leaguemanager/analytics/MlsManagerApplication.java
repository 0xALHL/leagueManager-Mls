package org.leaguemanager.analytics;

import org.leaguemanager.analytics.model.Player;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.time.LocalDate;

import java.time.LocalDate;

@SpringBootApplication
public class MlsManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MlsManagerApplication.class, args);


    //Testing Core Logic for Player
    Player player1 = new Player("Lionel", "Messi", 10, Player.Position.FORWARD,
            400000, LocalDate.of(1987, 6, 24));



   System.out.println("Age is :"+   player1.getAge());

    }
}
