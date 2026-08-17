package org.leaguemanager.analytics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.Period;

@Entity
public class Staff {
    private String staffFirstName;
    private String staffLastName;

    private int Salary;
    @Id
    private Long id;

    private LocalDate dateOfBirth;

    private enum staffCategory {
        Coaching,
        Executive,
        Medical,
        Scouting

    }
    // Got to figure out what to do with these Enums in JPA annotation
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

    // We need a method for calculating age similar to the player class so maybe just bring that over here
    public Integer ageCalculation(LocalDate dateOfBirth, LocalDate currentDate ) {
        if (dateOfBirth == null || currentDate == null) {
            return 0;
        }
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    // Regular Constructor
    public Staff(String staffFirstName, String staffLastName, int Salary){
        this.staffFirstName = staffFirstName;
        this.staffLastName = staffLastName;
        this.Salary = Salary;
    }
    // String Concatenation for Staff First and Last Name
    public String getFullName(){
        return this.staffFirstName + " " + this.staffLastName;
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
