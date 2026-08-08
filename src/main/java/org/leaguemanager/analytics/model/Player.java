package org.leaguemanager.analytics.model;



import java.time.LocalDate;
import java.time.Period;

public class Player {
    // Here I encapsulated these variables which are the core attributes for a player
    private String firstName;
    private String lastName;
    private int jerseyNumber;
    private Position position;
    //Using long since it gives us some overhead

    private long id;




    // Here I will add more specifics such as player financial and age
    private Integer salary;
    private LocalDate dateOfBirth;
    private LocalDate currentDate;

    //Constructor Method
    public Player(String firstName, String lastName, int jerseyNumber, Position position, long id, Integer salary, LocalDate dateOfBirth, LocalDate currentDate ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
        this.id = id;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
        this.currentDate = currentDate;



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
    public int ageCalculation(LocalDate dateOfBirth, LocalDate currentDate ) {
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
        return this.firstName + this.lastName;
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

        public void setId(long id){
            this.id = id;
        }

        public long getId(){
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

        public void setCurrentDate(LocalDate currentDate){
            this.currentDate = currentDate;
        }

        public LocalDate getCurrentDate(){
            return this.currentDate;
        }


}
