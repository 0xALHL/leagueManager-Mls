package org.leaguemanager.analytics.model;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
@Getter
@Setter
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
    private int totalYellowCards;



    //Passing
    private int totalCompletedPasses;
    private int totalPasses;
    private int totalCornerKicks;
    private int totalSuccessfulCrosses;
    private int attemptedCrosses;
    private int completedLongPasses;
    private int attemptedLongPass;
    private int freeKicks;
    //Attacking
    private int leftFootedShots;
    private int rightFootedShots;
    private int headedShots;
    private int penaltyKickGoals;
    private int penaltyKicksTaken;
    private int onTargetScoringAttempts;

    //Defending
    private int goalsAgainst;
    private int arielDuels;
    private int clearances;
    private int interceptions;




    //GoalKeeping
    private int cleanSheet;

    // Always check for 0 when doing averages
    public double goalsPer90(){
        if (totalMinutesPlayed == 0){
            return 0.0;
        }
            return ((double) totalGoals * 90 / totalMinutesPlayed );
    }
    // Finish Main Constructor
    public PlayerAnalytics(int totalGamesPlayed, int totalGamesStarted, int totalMinutesPlayed, int totalSubOn, int totalGoals,
                           int totalAssist, int totalTargetScoringAttempts,int totalKeyPasses, int totalFouls, int totalFoulsSuffered, int totalOffSides, int totalYellowCards, int totalRedCards, int totalCompletedPasses, int totalPasses, int totalCornerKicks ){

    }

    // No Args Constructor
    public PlayerAnalytics(){

    }

    public double longBallAccuracyPercentage(){

    }

    public double assistPer90() {

    }

    public double passPercentage(){

    }

    public double shotConversionRatio(){

    }

    public double accuratePassPercentage(){

    }

    public double crossPercentage(){

    }

    public double shotConversionRatio(){

    }

    public double shotConversion(){

    }

    public double averagePlayerRating(){

    }

    public double arielDuelPercentage(){

    }







    @Id
    private Long id;

}
