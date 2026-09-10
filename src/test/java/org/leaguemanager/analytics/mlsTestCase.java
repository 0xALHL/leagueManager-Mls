package org.leaguemanager.analytics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.leaguemanager.analytics.model.PlayerAnalytics;

public class mlsTestCase {

    // Lets run ap per

    @Test
    void goalsPer90CalculationCorrect(){
        PlayerAnalytics player1 = new PlayerAnalytics();
        player1.setTotalGoals(10);
        player1.setTotalMinutesPlayed();

        double result = player1.goalsPer90(900);


        assertEquals(1.0, result, 0.0001);
    }
}
