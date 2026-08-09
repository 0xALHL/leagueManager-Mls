package org.leaguemanager.analytics.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Teams")
public class Team {
// Encapsulated instance variables
    private String teamName;
    private String location;
    private String stadium;
    private Integer wins = 0;
    private Integer losses = 0;
    private Integer draws = 0;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //private Conference conference;

@Enumerated(EnumType.STRING)
private Conference conference;
public enum Conference{
    EASTERN,
    WESTERN
}




// Don't into the constructor
public Team(String teamName, String location, String stadium){
    this.teamName = teamName;
    this.location = location;
    this.stadium = stadium;
    //this.id = id;
    //this.conference = conference;
}
// Needed a no-arg Constructor
public Team(){

}

// We want to create some helper methods for winning, losing and draws.
// I will also give them public access modifiers so they can be accessed by the match class
public void recordWins(){
    wins++;

}

public void recordLosses(){
    losses++;

}


public void recordDraws(){
    draws++;

}




public Integer  getWins(){
    return this.wins;
}

public Integer getLosses(){
    return this.losses;
}

public Integer getDraws() {
    return this.draws;
}
// Do not make getters private because it defeats the purpose
public void setTeamName(String teamName){
    this.teamName = teamName;
}

public String getTeamName(){
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

public void setId(Long id){
    this.id = id;
}

public Long getId(){
    return this.id;
}

public void setConference(Conference conference){
    this.conference = conference;
    }

    public Conference getConference(){
        return this.conference;
    }







}


