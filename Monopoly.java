import java.util.*;
public class Monopoly 
{

    public static void main(String[] args) 
    {
        
        //createAll (instaniates board, players, cards, properties)
        
        //turns until game end

    }// end main


//roll method
    public static void rollofdice ()
    {
        Random rand = new Random();
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        int roll = dice1 + dice2;
        int count=0;
        while(count<=3)
        {
            if(dice1==dice2){count++;}
            if(dice1==dice2 && count==2){count++;}//add rest when turn is added
            if(dice1==dice2 && count==3){}//add once jail is added
            if(dice1!=dice2){break;}
        }
    System.out.println("You rolled a " + roll);
    //posibly add the sound of dice rolling.   
    }//end of rollofdice



//create Board
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
    public static HashMap<String, Property> createProperties()
    {
    HashMap<String, Property> propertyDeck = new HashMap<String, Property>();
    Property prop1 = new Property(); //come back to next time
    propertyDeck.put("",); 
    return propertyDeck;
    
    }



    
    public static Stack<String> createChance()
    {
        ArrayList<String> chance = new ArrayList<String>();

        chance.add("Advance to Boardwalk");
        chance.add("Advance to Go (Collect $200)");
        chance.add("Advance to Illinois Avenue. If you pass Go, collect $200");
        chance.add("Advance to St. Charles Place. If you pass Go, collect $200");
        chance.add("Advance to the nearest Railroad. If unowned, you may buy it from the Bank. If owned, pay wonder twice the rental to which they are otherwise entitled");
        chance.add("Advance to the nearest Railroad. If unowned, you may buy it from the Bank. If owned, pay wonder twice the rental to which they are otherwise entitled");
        chance.add("Advance token to nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times amount thrown.");
        chance.add("Bank pays you dividend of $50");
        chance.add("Get Out of Jail Free");
        chance.add("Go Back 3 Spaces");
        chance.add("Go to Jail. Go directly to Jail, do not pass Go, do not collect $200");
        chance.add("Make general repairs on all your property. For each house pay $25. For each hotel pay $100");
        chance.add("Speeding fine $15");
        chance.add("Take a trip to Reading Railroad. If you pass Go, collect $200");
        chance.add("You have been elected Chairman of the Board. Pay each player $50");
        chance.add("Your building loan matures. Collect $150");

        Stack<String> chanceCards = new Stack<String>();

        ArrayList<Integer> order = new ArrayList<Integer>();
        while (order.size() < 16)
        {
            Random rand = new Random();
            int rand1 = rand.nextInt(16);
            if (!(order.contains(rand1)))
            {
                order.add(rand1);
            }
        }

        for (int x = 0; x < 16; x++)
        {
            chanceCards.push(chance.get(order.get(x)));
        }
        return chanceCards;
        
    } // end createChance
    
    
//create Community Chest
    public static Stack<String> createCommunityChest()
    {
        ArrayList<String> communityChest = new ArrayList<String>();

        communityChest.add("Advance to Go (Collect $200)");
        communityChest.add("Bank error in your favor. Collect $200");
        communityChest.add("Doctor’s fee. Pay $50");
        communityChest.add("From sale of stock you get $50");
        communityChest.add("Get Out of Jail Free");
        communityChest.add("Go to Jail. Go directly to jail, do not pass Go, do not collect $200");
        communityChest.add("Holiday fund matures. Receive $100");
        communityChest.add("Income tax refund. Collect $20");
        communityChest.add("It is your birthday. Collect $10 from every player");
        communityChest.add("Life insurance matures. Collect $100");
        communityChest.add("Pay hospital fees of $100");
        communityChest.add("Pay school fees of $50");
        communityChest.add("Receive $25 consultancy fee");
        communityChest.add("You are assessed for street repair. $40 per house. $115 per hotel");
        communityChest.add("You have won second prize in a beauty contest. Collect $10");
        communityChest.add("You inherit $100");
        
        Stack<String> communityCards = new Stack<String>();

        ArrayList<Integer> order = new ArrayList<Integer>();
        while (order.size() < 16)
        {
            Random rand = new Random();
            int rand1 = rand.nextInt(16);
            if (!(order.contains(rand1)))
            {
                order.add(rand1);
            }
        }

        for (int x = 0; x < 16; x++)
        {
            communityCards.push(communityChest.get(order.get(x)));
        }
        return communityCards;
        
    } // end createChance

 


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




// Method for player turns
/*public static void turn
{
    if ( player1 is in jail)
    {
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
    }
    if (player1 has rolled 3 doubles)
    {
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
} //end turn method



        
public static void end() {
    Scanner sc = new Scanner(System.in);
if (sc.equals("end"){
    System.out.println("Game Over");
    System.exit(0);
    }
    }



public static void end game check() {
    if (player1.funds == 0 ){
        System.out.println("player1 is bankrupt");
        }
    if (player2.funds == 0){
      System.out.println("player2 is bankrupt");
      }
    if (player3.funds == 0 ){
      System.out.println("player3 is bankrupt");
      }
    if (player4.funds == 0 ){
       System.out.println("player4 is bankrupt");
        }
    if(player1 has a property || player2 has a property || player3 has a property || player4 has a property){
         bring up property details and ask if they want to sell it
         add money to player1 or player2 or player3 or player4
          }
    if(player1.funds > player2.funds && player1.funds > player3.funds && player1.funds > player4.funds )
          System.out.println("Player 1 is the winner")
          output each players amount of money in order greatest to least
          }
    if(player2.funds > player1.funds && player2.funds > player3.funds && player2.funds > player4.funds )
          System.out.println("Player 2 is the winner")
          output each players amount of money in order greatest to least
          }
    if(player3.funds > player1.funds && player3.funds > player2.funds && player3.funds > player4.funds )
          System.out.println("Player 3 is the winner")
          output each players amount of money in order greatest to least
          }
    if(player4.funds > player1.funds && player4.funds > player3.funds && player4.funds > player3.funds )
          System.out.println("Player 4 is the winner")
          output each players amount of money in order greatest to least
          }


*/
}//end class