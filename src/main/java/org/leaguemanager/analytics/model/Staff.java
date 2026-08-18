package org.leaguemanager.analytics.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.Period;


@Entity
public class Staff {
    private String staffFirstName;
    private String staffLastName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;
    private int salary;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateOfBirth;
    @Enumerated(EnumType.STRING)
    private StaffRole staffRole;
    @Enumerated(EnumType.STRING)
    private StaffCategory staffCategory;


    private enum StaffCategory {
        Coaching,
        Executive,
        Medical,
        Scouting

    }
    // Got to figure out what to do with these Enums in JPA annotation

    private enum StaffRole {
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
    public Staff(String staffFirstName, String staffLastName, int salary){
        this.staffFirstName = staffFirstName;
        this.staffLastName = staffLastName;
        this.salary = salary;
    }
    // String Concatenation for Staff First and Last Name
    public String getFullName(){
        return this.staffFirstName + " " + this.staffLastName;
    }
    // No Arg Constructor
    public Staff(){
    }

    // Getters and Setters for my staff variables
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

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary(){
        return this.salary;
    }


    public int getAge(){
        return ageCalculation(this.dateOfBirth, LocalDate.now());
    }

    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team){
        this.team = team;
    }
}
