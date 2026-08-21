package org.leaguemanager.analytics.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TeamAnalytics {
    // Tried to make passPercentage an instance variable but decided it would be best to make it a method
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

    public TeamAnalytics(int goals, int shotsTaken, int shotsOnTarget, int totalPassesAttempted, int totalPassesCompleted, int touches, int tacklesWon, int interceptions,
                         int foulsCommited, int yellowCards, int redCards, int saves, int goalsAgainst, int cleanSheets){
        this.goals = goals;
        this.shotsTaken = shotsTaken;
        this.shotsOnTarget = shotsOnTarget;
        this.totalPassesAttempted = totalPassesAttempted;
        this. totalPassesCompleted = totalPassesCompleted;
        this.touches = touches;
        this.tacklesWon = tacklesWon;
        this.interceptions = interceptions;
        this.foulsCommited = foulsCommited;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.saves = saves;
        this.goalsAgainst = goalsAgainst;
        this.cleanSheets = cleanSheets;
    }


    // Finishing up the Team Analytics Model and the Player Model tomorrow
    // Save down here for helper methods
    public void passCompletionPercentage(){

    }





    //No Arg Constructor
    public TeamAnalytics(){}

    //Getters and Setters at the bottom
}
