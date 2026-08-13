package org.leaguemanager.analytics.model;

import jakarta.persistence.*;

@Entity
public class Match {

    private int firstHalfPoints;
    private int secondHalfPoints;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Team homeTeam;
    @ManyToOne
    private Team awayTeam;
    private int homeScore;
    private int awayScore;

    // My Reg Constructor
    public Match(int firstHalfPoints, int secondHalfPoints, int homeScore, int awayScore, Team homeTeam, Team awayTeam){
        this.firstHalfPoints = firstHalfPoints;
        this.secondHalfPoints = secondHalfPoints;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }


    // No arg Constructor

    public Match(){

    }


    // We need to write some logic to determine what constitutes as a win, loss and or a draw

    public boolean isHomeWin() {
        return homeScore > awayScore;

    }

    public boolean isAwayWin(){
        return awayScore > homeScore;
    }

    public boolean isHomeLoss(){
        return homeScore < awayScore;
    }

    public boolean isAwayLoss(){
        return awayScore < homeScore;
    }

    public boolean isDraw(){
        return homeScore == awayScore;
    }

    // We are going to need some basic logic for isWin, isLoss, isDraw and they will likely be boolean

    // Getters and Setters



    public void setFirstHalfPoints(int firstHalfPoints){
        this.firstHalfPoints = firstHalfPoints;
    }

    public int getFirstHalfPoints(){
        return this.firstHalfPoints;
    }

    public void setSecondHalfPoints(int secondHalfPoints){
        this.secondHalfPoints = secondHalfPoints;
    }

    public int getSecondHalfPoints(){
        return this.secondHalfPoints;
    }

    public void setAwayScore(int awayScore){
       this.awayScore = awayScore;
    }

    public int getAwayScore(){
        return this.awayScore;
    }

    public void setHomeScore(int homeScore){
        this.homeScore = homeScore;
    }

    public int getHomeScore(){
        return this.homeScore;
    }

    public void setHomeTeam(Team homeTeam){
        this.homeTeam = homeTeam;
    }

    public Team getHomeTeam(){
        return this.homeTeam;
    }

    public void setAwayTeam (Team awayTeam){
        this.awayTeam = awayTeam;
    }

    public Team getAwayTeam(){
        return this.awayTeam;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
       return id;
    }


}
