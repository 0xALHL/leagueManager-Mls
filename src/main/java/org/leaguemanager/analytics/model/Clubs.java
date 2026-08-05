package org.leaguemanager.analytics.model;

public class Clubs {
// need getters and Setters
    private String clubName;
    private String location;
    private String stadium;
    private Conference conference;


private enum Conference{
    EASTERN,
    WESTERN
}

public Clubs(String clubName, String location, String stadium, Conference conference){
    this.clubName = clubName;
    this.location = location;
    this.stadium = stadium;
    this.conference = conference;
}


}


