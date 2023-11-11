import java.util.*;
public class monopoly{
public static void main(String[] args) {
//add to method to to roll the dice to move on the board
System.out.println(rollofdice());
//create property object to make an array list from
//find type for array list bellow
// ArrayList<> integer1 = new ArrayList<>();
// //treasure chest. 
// //find type for array list bellow
// ArrayList<> integer2 = new ArrayList<>();
// //community chest
// //find type for array list bellow
// ArrayList<> integer3= new ArrayList<>();

}// end main

//roll method
public static int rollofdice ()
{
    Random rand = new Random();
    int dice1 = rand.nextInt(6) + 1;
    int dice2 = rand.nextInt(6) + 1;
    int roll = dice1 + dice2;
    return roll;
}

public static ArrayList<String> createBoard()
{//ADD names of board spaces
    ArrayList<String> board = new ArrayList<String>();
    board.add("GO");
    board.add("Mediterranean Avenue");
    board.add("Community Chest");
    board.add("Baltic Avenue");
    board.add("Income Tax");
    board.add("Reading Railroad");
    board.add("Oriental Avenue");
    board.add("Chance");
    board.add("Vermont Avenue");
    board.add("Connecticut Avenue");
    board.add("Jail / Just Visiting");
    board.add("St. Charles Place");
    board.add("Electric Company");
    board.add("States Avenue");
    board.add("Virginia Avenue");
    board.add("Pennsylvania Railroad");
    board.add("St. James Place");
    board.add("Community Chest");
    board.add("Tennessee Avenue");
    board.add("New York Avenue");
    board.add("Free Parking");
    board.add("Kentucky Avenue");
    board.add("Chance");
    board.add("Indiana Avenue");
    board.add("Illinois Avenue");
    board.add("B. & O. Railroad");
    board.add("Atlantic Avenue");
    board.add("Ventnor Avenue");
    board.add("Water Works");
    board.add("Marvin Gardens");
    board.add("Go To Jail");
    board.add("Pacific Avenue");
    board.add("North Carolina Avenue");
    board.add("Community Chest");
    board.add("Pennsylvania Avenue");
    board.add("Short Line");
    board.add("Chance");
    board.add("Park Place");
    board.add("Luxury Tax");
    board.add("Boardwalk");
    return board;
    
}

}//end class

//figure out how to move players postiotion 


//add a while loop that keeps track of how many doubles each player has gotten per turn.  



//this may not be right but, its a start. this method rolls the dice and moves u forward.

   

//this method draws a chance card when you land on the chance space.
// public class chance {
//     static void chancecard () {
//         //add  once we add postion and board spaces and chance cards. 
        
// system.out.println();//print the chance card that was pulled. 
// //do what the chance card says
// }

// //this method draws a tresure card when you land on the tresure space.
// public class Community {
//     static void Communitychest () {
//         //add  once we add postion and board spaces and the Community chest. 
        
// system.out.println();//print the Community chest card  that was pulled. 
// //do what the Community chest card says.
// }


//}