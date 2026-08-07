package org.leaguemanager.analytics.model;

public class Team {
// Encapsulated instance variables
    private String teamName;
    private String location;
    private String stadium;
    //private Conference conference;


private enum Conference{
    EASTERN,
    WESTERN
}


public Team(String teamName, String location, String stadium){
    this.teamName = teamName;
    this.location = location;
    this.stadium = stadium;
    //this.conference = conference;
}
// Do not make getters private because it defeats the purpose
public void setClubName(String clubName){
    this.teamName = clubName;
}

public String getClubName(){
    return this.teamName;
}

public void setLocation(String location){
    this.location = location;
}

public String getLocation(){
    return this.location;
}

public void setStadium(String stadium){
    this.stadium = stadium;
}

public String getStadium(){
    return this.stadium;
}






}


