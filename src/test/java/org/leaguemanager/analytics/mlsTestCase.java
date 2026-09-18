package org.leaguemanager.analytics;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.leaguemanager.analytics.model.PlayerAnalytics;
import org.leaguemanager.analytics.model.TeamAnalytics;

public class mlsTestCase {


    // Goal Per 90 Unit Test
    @Test
    void goalsPer90CalculationCorrect(){
        PlayerAnalytics player1 = new PlayerAnalytics();
        player1.setTotalGoals(10);
        player1.setTotalMinutesPlayed(900);

        double result = player1.goalsPer90();

        System.out.print("Goals per 90: " + result);
        assertEquals(1.0, result, 0.0001);
    }
    // Pass Completion Percentage
    @Test
    void passCompletionPercentageCorrect(){
        TeamAnalytics team1 = new TeamAnalytics();
        team1.setTotalPassesAttempted(950);
        team1.setTotalPassesCompleted(600);

        double result2 = team1.passCompletionPercentage();

        System.out.print("Pass Completion %: " + result2);
    }

    // Test for Ariel Duel Percentage

    @Test
    void arielDuelPercentageCorrect(){
        PlayerAnalytics player1 = new PlayerAnalytics();
        player1.setArielDuelsWon(6);
        player1.setArielDuelsLost(2);

        double result = player1.arielDuelPercentage();

        System.out.print("Ariel Duel % " + result);

        assertEquals(75.0, result);
    }

}
