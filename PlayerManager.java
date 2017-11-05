/** 
 * Program: NFL Player Program
 * File: PlayerManager.java 
 * Summary: The PlayerManager program displays 6 characters and their attributes.
 * Author: Robert J Nichols
 * Date: 11/04/2017
 **/ 

class PlayerManager {
       
    public static void main(String[] args){
        createPlayers(); //Call createPlayers method
    }
    
    public static void createPlayers(){
        
        final int ARRAY_LENGTH = 6; //Declare constant to set array size.
        Player[] player = new Player[ARRAY_LENGTH]; //create an array of Player objects
        
        // Instantiate the Player class. 
        Player player1 = new Player("Tom", "Brady", 40, 12, "Michigan", "18 Seasons", "Patriots", "Quarterback", "Passing Yards", 2541, true); // Creates an instance of the Player class and initialize class instance variables
        Player player2 = new Player("Bryson", "Albright", 23, 54, "Miami", "1 Season", "Cardinals", "Outside Linebacker", "Passing Yards", 2541, true); // Creates an instance of the Player class and initialize class instance variables
        Player player3 = new Player("Kaelin", "Clay", 25, 12, "Utah", "3 Seasons", "Panthers", "Wide Receiver", "Passing Yards", 2541, true); // Creates an instance of the Player class and initialize class instance variables
        Player player4 = new Player("Matt", "Kalil", 28, 75, "Southern California", "6 Seasons", "Raiders", "Tackle", "Passing Yards", 2541, true); // Creates an instance of the Player class and initialize class instance variables
        Player player5 = new Player("David", "Mayo", 24, 55, "Texas", "3 Seasons", "Broncos", "Line backer", "Passing Yards", 2541, true); // Creates an instance of the Player class and initialize class instance variables
        Player player6 = new Player("Russel", "Shepard", 27, 5, "Ohio", "5 Seasons", "Cowboys", "Wide Receiver", "Passing Yards", 2541, true); // Creates an instance of the Player class and initialize class instance variables
        
        //add player objects to the array.
        player[0] = player1; // adding Tom Brady Player to the array of players
        player[1] = player2; // adding Bryson Albright Player to the array of players
        player[2] = player3; // adding Kaelin Clay Player to the array of players
        player[3] = player4; // adding Matt Kalil Player to the array of players
        player[4] = player5; // adding David Mayo Player to the array of players
        player[5] = player6; // adding Russel Shepard Player to the array of players
        
        //For loop used to iterate through the array of Players.
        for (int i = 0; i < player.length; i++){
            player[i].displayPlayerInfo(); //Display output to the console using the driver.
            System.out.println(); // readability line
        }
        
    }
    
}
