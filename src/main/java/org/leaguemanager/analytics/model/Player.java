package org.leaguemanager.analytics.model;



import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;
@Entity
@Table(name = "Players")
public class Player {
    // Here I encapsulated these variables which are the core attributes for a player
    private String firstName;
    private String lastName;
    private Integer jerseyNumber;
    @Enumerated(EnumType.STRING)
    private Position position;
    //Using long since it gives us some overhead
    // Using Long which is the wrapper class to long and is better for id's since there is no index associated with it on creation.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;



    // Here I will add more specifics such as player financial and age
    private Integer salary;
    private LocalDate dateOfBirth;


    //Constructor Method
    public Player(String firstName, String lastName, Integer jerseyNumber, Position position, Integer salary, LocalDate dateOfBirth ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;




    }
    // Remember to no Arg Constructors
    //Created a no arg constructor
    public Player(){

    }

    // Enum Positions since they are fixed.


    public enum Position {
        FORWARD,
        MIDFIELDER,
        DEFENDER,
        GOALKEEPER
    }

    //Age calculation Method
    // Returning null fixes an edge case where we get a null on someone's birthday
    public Integer ageCalculation(LocalDate dateOfBirth, LocalDate currentDate ) {
        if (dateOfBirth == null || currentDate == null){
            return 0;
        }
        return Period.between(dateOfBirth, currentDate).getYears();
    }
    public int getAge(){
        return ageCalculation(this.dateOfBirth, LocalDate.now());
    }

    //Method for Full Name
    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }
    // Getters and Setters{

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public String getFirstName(){
            return this.firstName;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public String getLastName(){
            return this.lastName;
        }

        public void setJerseyNumber(Integer jerseyNumber){
            this.jerseyNumber = jerseyNumber;
        }

        public Integer getJerseyNumber(){
            return this.jerseyNumber;
        }

        public void setPosition(Position position){
            this.position = position;
        }

        public Position getPosition(){
            return this.position;
        }

        public void setId(Long id){
            this.id = id;
        }

        public Long getId(){
            return this.id;
        }

        public void setSalary(Integer salary){
            this.salary = salary;
        }

        public Integer getSalary(){
            return this.salary;
        }

        public void setDateOfBirth(LocalDate dateOfBirth){
            this.dateOfBirth = dateOfBirth;
        }

        public LocalDate getDateOfBirth(){
            return this.dateOfBirth;
        }



}
