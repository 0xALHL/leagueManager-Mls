package org.leaguemanager.analytics.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TeamAnalytics {

    // Instance Variables for stats
    //Offensive Variables
    private int goals;
    private int shotsTaken;
    private int shotsOnTarget;
    private int totalPassesAttempted;
    private int totalPassesCompleted;
    private int touches;
    //Defensive Variables
    private int tacklesWon;
    private int interceptions;
    private int foulsCommited;
    private int yellowCards;
    private int redCards;
    private int saves;
    //Team Goalie Variables
    private int goalsAgainst;
    private int cleanSheets;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
