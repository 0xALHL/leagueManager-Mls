package org.leaguemanager.analytics.model;

public class Match {
    private boolean won;
    private boolean loss;
    private boolean draw;

    // My Team Options
    private enum matchTeams{
        homeTeam,
        awayTeam
    }

    // My Reg Constructor
    public Match(boolean won, boolean loss, boolean draw){
        this.won = won;
        this.loss = loss;
        this.draw = draw;
    }

    // Wea going to need some basic logic for isWin, isLoss, isDraw and they will likely be boolean

}
