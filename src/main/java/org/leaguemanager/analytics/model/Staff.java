package org.leaguemanager.analytics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Staff {
    private String staffFirstName;
    private String staffLastName;

    private int Salary;
    @Id
    private Long id;

    private enum staffCategory {
        Coaching,
        Executive,
        Medical,
        Scouting

    }

    private enum staffRole {
        HeadCoach,
        AssistantCoach,
        PositionCoach,
        HeadOfPerformanceCoach,
        StrengthAndConditioningCoach,
        TeamDoctor,
        AthleticTrainer,
        TeamNutritionist,
        VideoAnalyst,
        DirectorOfTeamOperations,
        EquipmentManager,
        President,
        VicePresident,
        SportingDirector,
        DirectorOfScouting,
        GeneralManager




    }

    // Helper Methods if needed

    // Regular Constructor
    public Staff(String staffFirstName, String staffLastName, int Salary){
        this.staffFirstName = staffFirstName;
        this.staffLastName = staffLastName;
        this.Salary = Salary;
    }


    // No Arg Constructor
    public Staff(){


    }

    // Getters and Setters
    public void setStaffFirstName(String staffFirstName){
        this.staffFirstName = staffFirstName;
    }

    public String getStaffFirstName(){
        return this.staffFirstName;
    }

    public void setStaffLastName(String staffLastName){
        this.staffLastName = staffLastName;
    }

    public String getStaffLastName(){
        return this.staffLastName;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public int getSalary(){
        return this.Salary;
    }
}
