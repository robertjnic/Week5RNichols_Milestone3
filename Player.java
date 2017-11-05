/** 
 * Program: NFL Player Program
 * File: Player.java 
 * Summary: The Player program displays a player and 10 player attributes.
 * Author: Robert J Nichols
 * Date: 11/04/2017
 **/ 

public class Player { //Begin Player Class

    // Decalre instance variables.
    private String firstName; // first name of player
    private String lastName; // last name of player
    private int age; // age of player
    private int number; // jersey number of player
    private String college; // college player went to
    private String experience; // how many seasons they've been in NFL
    private String team; // current team
    private String position; // current position
    private boolean isAvailable; // are they available to pick for your team?
    private String stat; // Stat string (dependent on which position they play).
    private int statInt; // The number of yards passed, received, etc.
    
    //declare an empty constructor
    public Player (){}
    
    // Declare the player constructor that takes in all of the players parameters
    public Player(String firstNameIn, String lastNameIn, int ageIn , int numIn, 
            String collegeIn, String experienceIn, String teamIn, String positionIn,
            String statIn, int statIntIn, boolean isAvailableIn)
    {
        //Assigns the values to their appropriate instance variable
        firstName = firstNameIn; 
        lastName = lastNameIn; 
        age = ageIn; 
        number = numIn; 
        college = collegeIn;
        experience = experienceIn;
        team = teamIn; 
        position = positionIn; 
        isAvailable = isAvailableIn; 
        stat = statIn;
        statInt = statIntIn;
    } // End player constructor
    
    public void setFirstName(String nameIn){
        this.firstName = nameIn; // Set instance variable to value passed into the method.
    } 
    
    public String getFirstName(){ 
        return this.firstName; // Get the value of the instance variable.
    }
    
    public void setLastName(String lastNameIn){
        this.lastName = lastNameIn; // Set instance variable to value passed into the method.
    }
    
    public String getLastName(){
        return this.lastName; // Get the value of the instance variable.
    }
    
    public void setAge(int ageIn){
        this.age = ageIn; // Set instance variable to value passed into the method.
    }
    
    public int getAge(){
        return age; // Get the value of the instance variable.
    }
    
    public void setNumber(int numIn){
        this.number = numIn; // Set instance variable to value passed into the method.
    }
    
    public int getNumber(){
        return number; // Get the value of the instance variable.
    }
    
    public void setCollege(String collegeIn){
        this.college = collegeIn; // Set instance variable to value passed into the method.
    }
    
    public String getCollege(){
        return this.college; // Get the value of the instance variable.
    }
    
    public void setExp(String experienceIn){
        this.experience = experienceIn; // Set instance variable to value passed into the method.
    }
    
    public String getExp(){
        return this.experience; // Get the value of the instance variable.
    }
    
    public void setTeam(String teamIn){
        this.firstName = teamIn; // Set instance variable to value passed into the method.
    }
    
    public String getTeam(){
        return this.team; // Get the value of the instance variable.
    }
    
    public void setPosition(String positionIn){
        this.firstName = positionIn; // Set instance variable to value passed into the method.
    }
    
    public String getPosition(){
        return this.position; // Get the value of the instance variable.
    }
    
    public void setStat(String statIn){
        this.stat = statIn; // Set instance variable to value passed into the method.
    }
    
    public String getStat(){
        return this.stat; // Get the value of the instance variable.
    }
    
    public void setStatInt(int statIntIn){
        this.statInt = statIntIn; // Set instance variable to value passed into the method.
    }
    
    public int getStatInt(){
        return statInt; // Get the value of the instance variable.
    }
    
    public void setAvailable(boolean isAvailableIn){
        this.isAvailable = isAvailableIn; // Set instance variable to value passed into the method.
    }
    
    public boolean getAvailable(){
        return this.isAvailable; // Get the value of the instance variable.
    }
    
    
    public void displayPlayerInfo(){
        //Displays Player info to the console.
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + String.valueOf(getAge()));
        System.out.println("Jersey number: " + String.valueOf(getNumber()));
        System.out.println("College: " + getCollege());
        System.out.println("Experience: " + getExp());
        System.out.println("Team: " + getTeam());
        System.out.println("Position: " + getPosition());
        System.out.print(getStat()+": ");
        System.out.println(getStatInt());
        System.out.println("Available? " + getAvailable());
    } // end displayPlayerInfo method.
    
}

//Driver class to test functionality.
class Player1 {
    public static void main(String[] args){
        //Tests each parameter of the player class to ensure it is printing correctly.
        Player player = new Player(
                "Tom", //First Name
                "Brady", //Last Name
                40, //Age
                12, //Jersey number
                "Michigan", //College
                "18th Season", //Experience
                "New England Patriots", //Team
                "Quarterback", //Position
                "Passing Yards", //Passing yards String (relative to position)
                2541, // Stat integer (relative to position)
                true); //Available to pick?
        
        player.displayPlayerInfo(); // prints the parameters to the console.
    }
}




    
    
        
        
   
    
