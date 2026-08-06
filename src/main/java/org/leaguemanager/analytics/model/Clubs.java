package org.leaguemanager.analytics.model;

public class Clubs {
// Encapsulated instance variables
    private String clubName;
    private String location;
    private String stadium;
    private Conference conference;


private enum Conference{
    EASTERN,
    WESTERN
}

    public void setconference(Conference conference) {
        this.conference = conference;
    }


public Clubs(String clubName, String location, String stadium, Conference conference){
    this.clubName = clubName;
    this.location = location;
    this.stadium = stadium;
    this.conference = conference;
}
// Do not make getters private because it defeats the purpose
public void setClubName(String clubName){
    this.clubName = clubName;
}

public String getClubName(){
    return this.clubName;
}

public void setlocation(String location){
    this.location = location;
}

public String getlocation(){
    return this.location;
}

public void setstadium(String stadium){
    this.stadium = stadium;
}

public String getStadium(){
    return this.stadium;
}






}


