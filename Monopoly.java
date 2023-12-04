import java.util.*;
import java.io.*;
public class Monopoly 
{
    public static Player player1 = new Player();
    public static Player player2 = new Player();
    public static Player player3 = new Player();
    public static Player player4 = new Player();

    public static ArrayList<String> board = new ArrayList<String>();
    public static Stack<String> chanceCards = new Stack<String>();
    public static Stack<String> communityCards = new Stack<String>();
    public static HashMap<String, Property> propertyDeck = new HashMap<String, Property>();

    public static void main(String[] args) 
    {
        //Welcome and find number of players
        int numberOfPlayers = 0;
        numberOfPlayers = welcome();
        
        //createAll (instaniates board, players, cards, properties)
        createGame(numberOfPlayers);
        
        //turns until game end
        

    }// end main

    public static int welcome()
    {
        System.out.println("welcome to monopoly");
        System.out.println("enter the number of players (you can have 2 3 or 4 players)");
        Scanner input = new Scanner(System.in);
        int welcome = input.nextInt();
        
        return welcome;
    }
   

    public static void turn()
    {
     System.out.println("do you want to take your turn?");
     System.out.println("type y for yes and n for no");
       Scanner input = new Scanner(System.in);
        String  turn = input.nextLine();
        if (turn.equals("y")){
            rollofdice();
            //space landed on
            //do board method
        }
        else if (turn.equals("n")){
            System.out.println("you have ended your turn");
           //move to 
        }
        else{
            System.out.println("please enter a valid input");
            turn();
        }


    //call do board method
    }

    public static void createGame(int numberOfPlayers)
    {
        board = createBoard();
        chanceCards = createChance();
        communityCards = createCommunityChest();
        propertyDeck = createProperties();


        Scanner in = new Scanner(System.in);
        if(numberOfPlayers == 2)
        {
            System.out.println("What is the name for Player 1 ?");
            String p1 = in.nextLine();
            player1.Name = p1;
            player1.PlayerID = 1;
            System.out.println("What is the name for Player 2 ?");
            String p2 = in.nextLine();
            player2.Name = p2;
            player2.PlayerID = 2;
        }
        if(numberOfPlayers == 3)
        {
            System.out.println("What is the name for Player 1 ?");
            String p1 = in.nextLine();
            player1.Name = p1;
            player1.PlayerID = 1;
            System.out.println("What is the name for Player 2 ?");
            String p2 = in.nextLine();
            player2.Name = p2;
            player2.PlayerID = 2;
            System.out.println("What is the name for Player 3 ?");
            String p3 = in.nextLine();
            player3.Name = p3;
            player3.PlayerID = 3;
        }
        if(numberOfPlayers == 4)
        {
            System.out.println("What is the name for Player 1 ?");
            String p1 = in.nextLine();
            player1.Name = p1;
            player1.PlayerID = 1;
            System.out.println("What is the name for Player 2 ?");
            String p2 = in.nextLine();
            player2.Name = p2;
            player2.PlayerID = 2;
            System.out.println("What is the name for Player 3 ?");
            String p3 = in.nextLine();
            player3.Name = p3;
            player3.PlayerID = 3;
            System.out.println("What is the name for Player 4 ?");
            String p4 = in.nextLine();
            player4.Name = p4;
            player4.PlayerID = 4;
        }
        else
        {
            System.out.println("Error wrong number of players !!!!!!!!");
        }
        in.close();
    }

//roll method5
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
        board.add("Mediterranean Avenue"); //proptery
        board.add("Community Chest");
        board.add("Baltic Avenue"); //proptery
        board.add("Income Tax");
        board.add("Reading Railroad");
        board.add("Oriental Avenue");//proptery
        board.add("Chance");
        board.add("Vermont Avenue");//proptery
        board.add("Connecticut Avenue");//proptery
        board.add("Jail / Just Visiting");
        board.add("St. Charles Place");//proptery
        board.add("Electric Company");
        board.add("States Avenue"); //proptery
        board.add("Virginia Avenue");//proptery
        board.add("Pennsylvania Railroad");//railroad
        board.add("St. James Place");//proptery
        board.add("Community Chest");
        board.add("Tennessee Avenue");//proptery
        board.add("New York Avenue");//proptery
        board.add("Free Parking");
        board.add("Kentucky Avenue");//proptery
        board.add("Chance");
        board.add("Indiana Avenue");//proptery
        board.add("Illinois Avenue");//proptery
        board.add("B. & O. Railroad");
        board.add("Atlantic Avenue");//proptery
        board.add("Ventnor Avenue");//proptery
        board.add("Water Works");//proptery
        board.add("Marvin Gardens");//proptery
        board.add("Go To Jail");
        board.add("Pacific Avenue");
        board.add("North Carolina Avenue");//proptery
        board.add("Community Chest");
        board.add("Pennsylvania Avenue");//proptery
        board.add("Short Line");
        board.add("Chance");
        board.add("Park Place");//proptery
        board.add("Luxury Tax");
        board.add("Boardwalk");//proptery
        return board;
    }

//create properties
    public static HashMap<String, Property> createProperties()
    {
    
    HashMap<String, Property> propertyDeck = new HashMap<String, Property>();

    Property prop1 = new Property("Mediterranean Avenue", "Brown", 60, 2, 30, 50);
    Property prop2 = new Property("Baltic Avenue", "Brown", 60, 4, 30, 50);
    Property prop3 = new Property("Oriental Avenue", "Light Blue", 100, 6, 50, 50);
    Property prop4 = new Property("Vermont Avenue", "Light Blue", 100, 6, 50, 50);
    Property prop5 = new Property("Connecticut Avenue", "Light Blue", 120, 8, 60, 50);  
    Property prop6 = new Property("St. Charles Place", "Pink", 140, 10, 70, 100);
    Property prop7 = new Property("States Avenue", "Pink", 140, 10, 70, 100);
    Property prop8 = new Property("Virginia Avenue", "Pink", 160, 12, 80, 100);
    Property prop9 = new Property("St. James Place", "Orange", 180, 14, 90, 100);
    Property prop10 = new Property("Tennessee Avenue", "Orange", 180, 14, 90, 100);
    Property prop11 = new Property("New York Avenue", "Orange", 200, 16, 100, 100);
    Property prop12 = new Property("Kentucky Avenue", "Red", 220, 18, 110, 150);
    Property prop13 = new Property("Indiana Avenue", "Red", 220, 18, 110, 150);
    Property prop14 = new Property("Illinois Avenue", "Red", 240, 20, 120, 150);
    Property prop15 = new Property("Atlantic Avenue", "Yellow", 260, 22, 130, 150);
    Property prop16 = new Property("Ventnor Avenue", "Yellow", 260, 22, 130, 150);
    Property prop17 = new Property("Marvin Gardens", "Yellow", 280, 24, 140, 150);
    Property prop18 = new Property("Pacific Avenue", "Green", 300, 26, 150, 200);
    Property prop19 = new Property("North Carolina Avenue", "Green", 300, 26, 150, 200);
    Property prop20 = new Property("Pennsylvania Avenue", "Green", 320, 28, 160, 200);
    Property prop21 = new Property("Park Place", "Blue", 350, 35, 175, 200);
    Property prop22 = new Property("Boardwalk", "Blue", 400, 50, 200, 200);
    
    Property prop23 = new Property("Reading Railroad",  200, 25, 100);
    Property prop24 = new Property("Pennsylvania Railroad",  200, 25, 100);
    Property prop25 = new Property("B. & O. Railroad",  200, 25, 100);
    Property prop26 = new Property("Short Line", 200, 25, 100); 
    Property prop27 = new Property("Electric Company",  150, 0, 75);
    Property prop28 = new Property("Water Works",  150, 0, 75);

    
    propertyDeck.put("Mediterranean Avenue", prop1); 
    propertyDeck.put("Baltic Avenue", prop2);
    propertyDeck.put("Oriental Avenue", prop3);
    propertyDeck.put("Vermont Avenue", prop4);
    propertyDeck.put("Connecticut Avenue", prop5);
    propertyDeck.put("St. Charles Place", prop6);
    propertyDeck.put("States Avenue", prop7);
    propertyDeck.put("Virginia Avenue", prop8);
    propertyDeck.put("St. James Place", prop9);
    propertyDeck.put("Tennessee Avenue", prop10);
    propertyDeck.put("New York Avenue", prop11);
    propertyDeck.put("Kentucky Avenue", prop12);
    propertyDeck.put("Indiana Avenue", prop13);
    propertyDeck.put("Illinois Avenue", prop14);
    propertyDeck.put("Atlantic Avenue", prop15);
    propertyDeck.put("Ventnor Avenue", prop16);
    propertyDeck.put("Marvin Gardens", prop17);
    propertyDeck.put("Pacific Avenue", prop18);
    propertyDeck.put("North Carolina Avenue", prop19);
    propertyDeck.put("Pennsylvania Avenue", prop20);
    propertyDeck.put("Park Place", prop21);
    propertyDeck.put("Boardwalk", prop22);
    
    propertyDeck.put("Reading Railroad", prop23);
    propertyDeck.put("Pennsylvania Railroad", prop24);
    propertyDeck.put("B. & O. Railroad", prop25);
    propertyDeck.put("Short Line", prop26);
    propertyDeck.put("Electric Company", prop27);
    propertyDeck.put("Water Works", prop28);
    


    return propertyDeck;
    
    }



//create chance deck    
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

// public static void doBoard(String spaceLandedOn)
// {

//     //a giant switch statement for board effects

//     switch (spaceLandedOn)
//     {
//         case "In Jail":
//         if (player1.hasGetOutOfJailFreeCard()) {
//         // Ask player if they want to use it
//         if (player1.wantsToUseGetOutOfJailFreeCard()) {
//             // Remove get out of jail free card from player1
//             player1.removeGetOutOfJailFreeCard();
//             // Move player1 out of jail
//             player1.moveOutOfJail();
//             // Roll dice
//             int roll = player1.rollDice();
//             // Move player1
//             player1.move(roll);
//             // Move to the next player
//     game.nextPlayerTurn();
//     break;
//         }
//     }
//        case "Property":
//         {
//             Property currentProperty = board.getPropertyAt(player1.getPosition());
//     if (!currentProperty.isOwned()) {
//         // Ask player if they want to buy property
//         if (player1.wantsToBuyProperty(currentProperty)) {
//             // Remove money from player1
//             player1.removeMoney(currentProperty.getPrice());
//             // Add property to player1
//             player1.addProperty(currentProperty);
//             // Set the owner of the property
//             currentProperty.setOwner(player1);
//         }
//     } else if (currentProperty.getOwner() != player1) {
//         // Remove rent from player1
//         player1.removeMoney(currentProperty.getRent());
//         // Add rent to owner
//         currentProperty.getOwner().addMoney(currentProperty.getRent());
//     }
    
//     // Move to the next player
//     game.nextPlayerTurn();
//         break;
//         }
        
//             case "Chance":
//             {
//              //draw a chance card
//              ChanceCard chanceCard = game.drawChanceCard();   
//              //do what the chance card says
//              chanceCard.excuteAction(player1);
//              //move to next player
//              game.nextPlayerTurn();
//                 break;
//             }
//             case "Community Chest":
//             {
//                 // Draw a community chest card
//              CommunityChestCard communityChestCard = game.drawCommunityChestCard();
//                 // Execute the action of the community chest card
//                 communityChestCard.executeAction(player1);
//                 // Move to the next player
//                 game.nextPlayerTurn();
//                     break;
                
//             }
//             case "Go To Jail":
//             {
//                 // Move player1 to jail
//                  player1.moveToJail();
//                  // Move to the next player
//                     game.nextPlayerTurn();
//                     break;
//             }
//             case "Vist Jail":
//             {
//                 game.nextPlayerTurn();
//                 break;
//             }
//            case "Free Parking":
//            {
//                game.nextPlayerTurn();
//                break;
//            }
//            case "Go":
//            {
//                // Add money to player1
//                player1.addMoney(200);
//                // Move to the next player
//                game.nextPlayerTurn();
//                break;
//            }
//            case "income tax":
//            {
//                // Remove money from player1
//                player1.removeMoney(200);
//                // Move to the next player
//                game.nextPlayerTurn();
//                break;
//            }
//            case "Luxery Tax":
//            {
//                // Remove money from player1
//                player1.removeMoney(75);
//                // Move to the next player
//                game.nextPlayerTurn();
//                break;
//            }
           

// }
// }


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