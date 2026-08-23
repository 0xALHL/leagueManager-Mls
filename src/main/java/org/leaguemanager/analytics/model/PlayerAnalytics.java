package org.leaguemanager.analytics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class PlayerAnalytics {

    //General Stats
    private int totalGamesPlayed;
    private int totalGamesStarted;
    private int totalMinutesPlayed;
    private int totalSubOn;
    private int totalGoals;
    private int totalAssist;
    private int totalTargetScoringAttempts;
    private int totalKeyPasses;
    private int totalFouls;
    private int totalFoulsSuffered;
    private int totalOffSides;
    private int totalRedCards;



    //Passing
    private int totalCompletedPasses;
    private int totalPasses;
    private int totalCornerKicks;
    private int totalSuccessfulCrosses;
    //Attacking
    private int leftFootedShots;
    private int rightFootedShots;
    private int headedShots;
    private int penaltyKickGoals;
    private int penaltyKicksTaken;

    //Defending



    //GoalKeeping


    // Always check for 0 when doing averages
    public double goalsPer90(){
        if (totalMinutesPlayed == 0){
            return 0.0;
        }
            return ((double) totalGoals * 90 / totalMinutesPlayed );
    }

    public double passPercentage(){

    }

    public double shotConversionRatio(){

    }

    public double accuratePassPercentage(){

    }



    @Id
    private Long id;

}
