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

    //Offensive Getters and Setters

    public void setGoals(int goals){
        this.goals = goals;
    }

    public int getGoals(){
        return this.goals;
    }

    public void setShotsTaken(int shotsTaken){
        this.shotsTaken = shotsTaken;
    }

    public int getShotsTaken() {
        return this.shotsTaken;
    }

    public void setShotsOnTarget(int shotsOnTarget){
        this.shotsOnTarget = shotsOnTarget;
    }

    public int getShotsOnTarget(){
        return this.shotsOnTarget;
    }

    public void setTotalPassesAttempted(int totalPassesAttempted){
        this.totalPassesAttempted = totalPassesAttempted;
    }

    public int getTotalPassesAttempted(){
        return this.totalPassesAttempted;
    }

    public void setTotalPassesCompleted(int totalPassesCompleted){
        this.totalPassesCompleted = totalPassesCompleted;
    }

    public int getTotalPassesCompleted(){
        return this.totalPassesCompleted;
    }


    public void setTouches(int touches){
        this.touches = touches;
    }

    public int getTouches(){
        return this.touches;
    }
    //Defensive Getters and Setters

    public void setTacklesWon(int tacklesWon){
        this.tacklesWon = tacklesWon;
    }

    public int getTacklesWon(){
        return this.tacklesWon;
    }

    public void setInterceptions(int interceptions){
        this.interceptions = interceptions;
    }

    public int getInterceptions(){
        return this.interceptions;
    }

    public void setFoulsCommited(int foulsCommited){
        this.foulsCommited = foulsCommited;
    }

    public int getFoulsCommited(){
        return this.foulsCommited;
    }

    public void setYellowCards(int yellowCards){
        this.yellowCards = yellowCards;
    }

    public int getYellowCards(){
        return this.yellowCards;
    }

    public void setRedCardsCards(int redCards){
        this.redCards = redCards;
    }

    public int getRedCards(){
        return this.redCards;
    }

    public void setSaves(int saves){
        this.saves = saves;
    }

    public int getSaves(){
        return this.saves;
    }

    // Goal Keeper Getters and Setters

    public void setGoalsAgainst(int goalsAgainst){
        this.goalsAgainst = goalsAgainst;
    }

    public int getGoalsAgainst(){
        return this.goalsAgainst;
    }

    public void setCleanSheets(int cleanSheets){
        this.cleanSheets = cleanSheets;
    }

    public int getCleanSheets(){
        return this.cleanSheets;
    }


}
