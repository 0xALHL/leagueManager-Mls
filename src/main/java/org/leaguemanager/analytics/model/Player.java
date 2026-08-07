package org.leaguemanager.analytics.model;
import java.time.LocalDate;

public class Player {
    // Here I encapsulated these variables which are the core attributes for a player
    private String firstName;
    private String lastName;
    private int jerseyNumber;
    private Position position;
    //Using long since it gives us some overhead
    private long playerId;




    // Here I will add more specifics such as player mesurements financial and age
    private Integer salary;
    private LocalDate dateOfBirth;

    //Constructor Method
    public Player(String firstName, String lastName, int jerseyNumber, Position position, long playerId, Integer salary, LocalDate dateOfBirth ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
        this.playerId = playerId;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;



    }

    // Enum Positions since they are fixed.

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

        public void setPlayerId(long playerId){
            this.playerId = playerId;
        }

        public long getPlayerId(){
            return this.playerId;
        }

        public void setSalary(Integer salary){
            this.salary = salary;
        }

        public Integer getSalary(){
            return this.salary;
        }

        public void setAge(LocalDate age) {
            this.dateOfBirth = age;
        }

        public LocalDate getAge(){
            return this.dateOfBirth;
        }


}
