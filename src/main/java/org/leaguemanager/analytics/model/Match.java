package org.leaguemanager.analytics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;
@Entity
public class Match {
    private boolean won;
    private boolean loss;
    private boolean draw;
    private Integer firstHalfPoints;
    private Integer secondHalfPoints;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;




    // My Team Options
    private enum matchTeams{
        homeTeam,
        awayTeam
    }

    // My Reg Constructor
    public Match(boolean won, boolean loss, boolean draw, Integer firstHalfPoints,Integer secondHalfPoints){
        this.won = won;
        this.loss = loss;
        this.draw = draw;
        this.firstHalfPoints = firstHalfPoints;
        this.secondHalfPoints = secondHalfPoints;
    }


    // No arg Constructor

    public Match(){

    }


    // We need to write some logic to determine what constitutes as a win, loss and or a draw

    public boolean isWon(){

    }

    public boolean isLoss(){

    }

    public boolean isDraw(){

    }

    // We are going to need some basic logic for isWin, isLoss, isDraw and they will likely be boolean

    // Getters and Setters

    public void setWon(Boolean won){
        this.won = won;
    }

    public Boolean getWon(){
        return this.won;
    }

    public void setLoss(Boolean loss) {
        this.loss = loss;
    }

    public Boolean getLoss(){
        return this.loss;
    }

    public void setDraw(Boolean draw){
        this.draw = draw;
    }

    public Boolean getDraw(){
        return this.draw;
    }

    public void setFirstHalfPoints(Integer firstHalfPoints){
        this.firstHalfPoints = firstHalfPoints;
    }

    public Integer getFirstHalfPoints(){
        return this.firstHalfPoints;
    }

    public void getSecondHalfPoints(Integer secondHalfPoints){
        this.secondHalfPoints = secondHalfPoints;
    }

    public Integer getSecondHalfPoints(){
        return this.secondHalfPoints;
    }
}
