import java.util.*;
public class Monopoly{
public static void main(String[] args) {
//add to method to to roll the dice to move on the board
rollofdice();

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
public static void rollofdice ()
{
    Random rand = new Random();
    int dice1 = rand.nextInt(6) + 1;
    int dice2 = rand.nextInt(6) + 1;
    int roll = dice1 + dice2;
int count=0;
while(count<=3){
if(dice1==dice2){count++;}
if(dice1==dice2 && count==2){count++;}//add rest when turn is added
if( dice1==dice2 && count==3){}//add once jail is added
if(dice1!=dice2){break;}
}
System.out.println("You rolled a " + roll);
//posibly add the sound of dice rolling.   
}//end of rollofdice
////method to move player forward //e

public static void move ()
{
    //int space =0;
    //if(roll is less space){set space to that number and store it in player data and
        //print how many spaces the player moved}
}//end of move method.


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
ArrayList<String> chance = new ArrayList<String>();
Random rand = new Random();
    int card = rand.nextInt(15) + 1;
    while( chane.size=<16){
    if (card == 1) {
        
    }

    }

//figure out how to move players postiotion 


//add a while loop that keeps track of how many doubles each player has gotten per turn.  
//resets after each turn
//if they get 3 they go to jail. 
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
}//end class
// Method for player turns
/*public static void playerturns {
    if ( player1 is in jail){
        if (player1 has a get out of jail free card){
            ask player if they want to use it
            if (yes){
                remove get out of jail free card from player1
                move player1 out of jail
                roll dice
                move player1
            move to the next player
            }
            if (no){
                move to the next player
                }
                if (player1 has rolled 3 doubles){
                    move player1 to jail
                    move to the next player
                    }
                    if ( player lands on property) {
                       bring up property details
                       ask player if they want to buy property
                          if (yes){
                            remove money from player1
                            add property to player1
                            }
                            if (no){
                                 move to the next player
                                 }
                                 if (player1 lands on property owned by another player){
                                      remove rent / money from player1
                                      add rent / money to player2
                                      }
                                        if (player1 lands on chance){
                                        bring up chance card
                                        do what chance card says
                                        }
                                        if (player1 lands on community chest){
                                             bring up community chest card
                                             do what community chest card says
                                             }
                                             if (player1 lands on go to jail){
                                                  move player1 to jail
                                                  }
                                                  if (player1 lands on free parking){
                                                    do nothing
                                                    }
                                                    if (player1 lands on go){
                                                         add money to player1
                                                         }
                                                         if (player1 lands on income tax){
                                                              remove money from player1
                                                              }
                                                              if (player1 lands on luxury tax){
                                                                remove money from player1
                                                                }
                                                                if (player1 lands on electric company){
                                                                     bring up electric company details
                                                                     ask player if they want to buy electric company
                                                                     if (yes){
                                                                          remove money from player1
                                                                          add electric company to player1
                                                                          }
                                                                          if (no){
                                                                            move to the next player
                                                                            }
                                                                            if (player1 lands on water works){
                                                                                 bring up water works details
                                                                                 ask player if they want to buy water works
                                                                                 if (yes){
                                                                                      remove money from player1
                                                                                      add water works to player1
                                                                                      }
                                                                                      if (no){
                                                                                        move to the next player
                                                                                        }
                                                                                        if (player1 lands on railroad){
                                                                                             bring up railroad details
                                                                                             ask player if they want to buy railroad
                                                                                             if (yes){
                                                                                                  remove money from player1
                                                                                                  add railroad to player1 
                                                                                                  }
                                                                                                  if(no){
                                                                                                    move to the next player
                                                                                                              }
                                                                                                         }
                                                                                                    }
public static void end game check() {
    if (player1 has no money){
        System.out.println("player1 is bankrupt");
        }
        if (player2 has no money){
            System.out.println("player2 is bankrupt");
            }
            if (player3 has no money){
                System.out.println("player3 is bankrupt");
                }
                if (player4 has no money){
                    System.out.println("player4 is bankrupt");
                    }
                    if(player1 has a property || player2 has a property || player3 has a property || player4 has a property){
                     bring up property details and ask if they want to sell it
                     add money to player1 or player2 or player3 or player4
                       }
                        if(player1.money < player.money )
                  }