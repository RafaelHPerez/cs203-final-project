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
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
    board.add("GO");
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