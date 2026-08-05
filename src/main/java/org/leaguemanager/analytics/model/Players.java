package org.leaguemanager.analytics.model;
import java.time.LocalDate;

public class Players {
    // Here I encapsulated these variables which are the core attributes for a player
    private String firstName;
    private String lastName;
    private int jerseyNumber;
    private Position position;




    // Here I will add more specifics such as player mesurements financial and age
    private Integer salary;
    private LocalDate age;

    //Constructor Method
    public Players(String firstName, String lastName, int jerseyNumber, Position position, Integer salary,LocalDate age ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
        this.salary = salary;
        this.age = age;



    }

    // Enumurating Posistions since they are fixed and we know what they are.

    public enum Position {
        FORWARD,
        MIDFIELDER,
        DEFENDER,
        GOALKEEPER
    }
    // Getters and Setters
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

        public void setJerseyNumber(int jerseyNumber){
            this.jerseyNumber = jerseyNumber;
        }

        public int getJerseyNumber(){
            return this.jerseyNumber;
        }

        public void setPosition(Position position){
            this.position = position;
        }

        public Position getPosition(){
            return this.position;
        }

        public void setSalary(Integer salary){
            this.salary = salary;
        }

        public Integer getSalary(){
            return this.salary;
        }

        public void setage(LocalDate age) {
            this.age = age;
        }

        public LocalDate getage(){
            return this.age;
        }


}
