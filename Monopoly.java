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
        gameTilEnd(numberOfPlayers);

    }// end main

    public static int welcome()
    {
        System.out.println("Welcome to monopoly! The current version is set to be normal monopoly with a few exceptions.");
        System.out.println("The game starts with each player having $1500. The game is played in rounds");
        System.out.println("There is no auctioning off properties, there are 2 chance cards missing and there is no trading.");
        System.out.println("There are 2 commmunity chest cards missing. Luxury tax is $100 and income tax is $200.");
        System.out.println("and it ends when the first player goes bankrupt. So that it does not take forever to play.");
        System.out.println("enter the number of players currently the code will only work with 4 players");
        System.out.println("if you only have 1 friend you must go make more friends to play this game");
        Scanner input = new Scanner(System.in);
        int welcome = input.nextInt();
        
        return welcome;
    }
   
   public static void gameTilEnd(int numberOfPlayers)
   {
        int currentPlayerID = 1;
        do
        {
            turn(currentPlayerID);
            //do board method
            if (currentPlayerID == numberOfPlayers)
            {
                currentPlayerID = 1;
            }
            else
            {
                currentPlayerID = currentPlayerID + 1;
            }
        }while(player1.funds > 0 && player2.funds > 0 && player3.funds > 0 && player4.funds > 0);
   }

    public static void turn(int currentPlayerID)
    {
        System.out.println("do you want to take your turn? type y for yes and n to immediately end the whole game");
        Scanner input = new Scanner(System.in);
        String  turn = input.nextLine();
        if (turn.equals("y")){
            rollofdice();
            //space landed on
            //do board method
        }
        else if (turn.equals("n")){
            System.out.println("you have ended the game");
            player1.funds = 0;
            player2.funds = 0;
            player3.funds = 0;
            player4.funds = 0;
           //move to 
        }
        else{
            System.out.println("please enter a valid input");
            turn(currentPlayerID);
        }
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
            if(dice1!=dice2){break;
            
        }
        }
    System.out.println("You rolled a " + roll);
    //posibly add the sound of dice rolling.   
    }//end of rollofdice



//create Board
    public static ArrayList<String> createBoard()
    {//ADD names of board spaces
        
        ArrayList<String> board = new ArrayList<String>();
        board.add("GO"); //0
        board.add("Mediterranean Avenue"); //1 property
        board.add("Community Chest");//2
        board.add("Baltic Avenue"); //3 property
        board.add("Income Tax");//4
        board.add("Reading Railroad");//5
        board.add("Oriental Avenue");//6 property
        board.add("Chance");//7
        board.add("Vermont Avenue");//8 property
        board.add("Connecticut Avenue");//9 property
        board.add("Jail / Just Visiting");//10
        board.add("St. Charles Place");//11 property
        board.add("Electric Company");//12
        board.add("States Avenue"); //13   property
        board.add("Virginia Avenue");//14 property
        board.add("Pennsylvania Railroad");//15
        board.add("St. James Place");//16 property
        board.add("Community Chest");//17
        board.add("Tennessee Avenue");//18 property
        board.add("New York Avenue");//19 property
        board.add("Free Parking"); //20
        board.add("Kentucky Avenue");//21 property
        board.add("Chance");//22
        board.add("Indiana Avenue");//23   property
        board.add("Illinois Avenue");//24 property
        board.add("B. & O. Railroad");//25
        board.add("Atlantic Avenue");//26 property
        board.add("Ventnor Avenue");//27 property
        board.add("Water Works");//28
        board.add("Marvin Gardens");//29 property
        board.add("Go To Jail");//30
        board.add("Pacific Avenue");//31 property
        board.add("North Carolina Avenue");//32 property
        board.add("Community Chest");//33
        board.add("Pennsylvania Avenue");//34  property
        board.add("Short Line");//35
        board.add("Chance");//36
        board.add("Park Place");//37   property
        board.add("Luxury Tax");//38
        board.add("Boardwalk");//39 property
        return board;
    }

//create properties
    public static HashMap<String, Property> createProperties()
    {
    
    HashMap<String, Property> propertyDeck = new HashMap<String, Property>();
    Property prop1 = new Property("Mediterranean Avenue", "Brown", 60, 2, 4,  10, 30, 90, 160, 250, 30, 50);
    Property prop2 = new Property("Baltic Avenue", "Brown", 60, 4, 8, 20, 60, 180, 320, 450, 30, 50);
    Property prop3 = new Property("Oriental Avenue", "Light Blue", 100, 6, 12, 30, 90, 270, 400, 550, 50, 50);
    Property prop4 = new Property("Vermont Avenue", "Light Blue", 100, 6, 12, 30, 90, 270, 400, 550, 50, 50);
    Property prop5 = new Property("Connecticut Avenue", "Light Blue", 120, 8, 16, 40, 100, 300, 450, 600, 60, 50);
    Property prop6 = new Property("St. Charles Place", "Pink", 140, 10, 20, 50, 150, 450, 625, 750, 70, 100);
    Property prop7 = new Property("States Avenue", "Pink", 140, 10, 20, 50, 150, 450, 625, 750, 70, 100);
    Property prop8 = new Property("Virginia Avenue", "Pink", 160, 12, 24, 60, 180, 500, 700, 900, 80, 100);
    Property prop9 = new Property("St. James Place", "Orange", 180, 14, 28, 70, 200, 550, 750, 950, 90, 100);
    Property prop10 = new Property("Tennessee Avenue", "Orange", 180, 14, 28, 70, 200, 550, 750, 950, 90, 100);
    Property prop11 = new Property("New York Avenue", "Orange", 200, 16, 32, 80, 220, 600, 800, 1000, 100, 100);
    Property prop12 = new Property("Kentucky Avenue", "Red", 220, 18, 36, 90, 250, 700, 875, 1050, 110, 150);
    Property prop13 = new Property("Indiana Avenue", "Red", 220, 18, 36, 90, 250, 700, 875, 1050, 110, 150);
    Property prop14 = new Property("Illinois Avenue", "Red", 240, 20, 40, 100, 300, 750, 925, 1100, 120, 150);
    Property prop15 = new Property("Atlantic Avenue", "Yellow", 260, 22, 44, 110, 330, 800, 975, 1150, 130, 150);
    Property prop16 = new Property("Ventnor Avenue", "Yellow", 260, 22, 44, 110, 330, 800, 975, 1150, 130, 150);
    Property prop17 = new Property("Marvin Gardens", "Yellow", 280, 24, 48, 120, 360, 850, 1025, 1200, 140, 150);
    Property prop18 = new Property("Pacific Avenue", "Green", 300, 26, 52, 130, 390, 900, 1100, 1275, 150, 200);
    Property prop19 = new Property("North Carolina Avenue", "Green", 300, 26, 52, 130, 390, 900, 1100, 1275, 150, 200);
    Property prop20 = new Property("Pennsylvania Avenue", "Green", 320, 28, 56, 150, 450, 1000, 1200, 1400, 160, 200);
    Property prop21 = new Property("Park Place", "Blue", 350, 35, 70, 175, 500, 1100, 1300, 1500, 175, 200);
    Property prop22 = new Property("Boardwalk", "Blue", 400, 50, 100, 200, 600, 1400, 1700, 2000, 200, 200);
    
 

    
    Property prop23 = new Property("Reading Railroad",  200, 25, 50, 100, 200, 100);
    Property prop24 = new Property("Pennsylvania Railroad",  200, 25, 50, 100, 200, 100);
    Property prop25 = new Property("B. & O. Railroad",  200, 25,50, 100, 200, 100);
    Property prop26 = new Property("Short Line", 200, 25, 50, 100, 200,100); 
    
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
        chance.add("Go Back 3 Spaces");
        chance.add("Go to Jail. Go directly to Jail, do not pass Go, do not collect $200");
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
        communityChest.add("Go to Jail. Go directly to jail, do not pass Go, do not collect $200");
        communityChest.add("Holiday fund matures. Receive $100");
        communityChest.add("Income tax refund. Collect $20");
        communityChest.add("It is your birthday. Collect $10 from every player");
        communityChest.add("Life insurance matures. Collect $100");
        communityChest.add("Pay hospital fees of $100");
        communityChest.add("Pay school fees of $50");
        communityChest.add("Receive $25 consultancy fee");
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


public static void checkPropertyStatus(int playerID, String propertyName)
{
    Property currentProperty = propertyDeck.get(propertyName);
    int propertyCost = currentProperty.getCost();
    if (!currentProperty.isOwned()) {
        if (playerID == 1)
        {
            if (player1.wantsToBuyProperty(propertyName, propertyCost)) {
                // Remove money from player1
                player1.removeMoney(propertyCost);
                // Set the owner of the property
                currentProperty.setOwner(1);
            }
        }
        else if (playerID == 2)
        {
            if (player2.wantsToBuyProperty(propertyName, propertyCost)) {
                // Remove money from player2
                player2.removeMoney(propertyCost);
                // Set the owner of the property
                currentProperty.setOwner(2);
            }
        }
        else if (playerID == 3)
        {
            if (player3.wantsToBuyProperty(propertyName, propertyCost)) {
                // Remove money from player3
                player3.removeMoney(propertyCost);
                // Set the owner of the property
                currentProperty.setOwner(3);
            }
        }
        else if (playerID == 4)
        {
            if (player4.wantsToBuyProperty(propertyName, propertyCost)) {
                // Remove money from player4
                player4.removeMoney(propertyCost);
                // Set the owner of the property
                currentProperty.setOwner(4);
            }
        }
    } // end buy contingency

    //paying rent 
    else if (currentProperty.getOwner() != playerID) {
        // Remove rent from playerID
        if (playerID == 1)
        {
            player1.removeMoney(currentProperty.getRent());
            // Add rent to owner
            if(currentProperty.getOwner() == 2)
            {
                player2.addMoney(currentProperty.getRent());
            }
            else if(currentProperty.getOwner() == 3)
            {
                player3.addMoney(currentProperty.getRent());
            }
            else if(currentProperty.getOwner() == 4)
            {
                player4.addMoney(currentProperty.getRent());
            }
            
        }
        else if (playerID == 2)
        {
            player2.removeMoney(currentProperty.getRent());
            // Add rent to owner
            if(currentProperty.getOwner() == 1)
            {
                player1.addMoney(currentProperty.getRent());
            }
            else if(currentProperty.getOwner() == 3)
            {
                player3.addMoney(currentProperty.getRent());
            }
            else if(currentProperty.getOwner() == 4)
            {
                player4.addMoney(currentProperty.getRent());
            }
        }
        else if (playerID == 3)
        {
            player3.removeMoney(currentProperty.getRent());
            // Add rent to owner
            if(currentProperty.getOwner() == 1)
            {
                player1.addMoney(currentProperty.getRent());
            }
            else if(currentProperty.getOwner() == 2)
            {
                player2.addMoney(currentProperty.getRent());
            }
            else if(currentProperty.getOwner() == 4)
            {
                player4.addMoney(currentProperty.getRent());
            }
        }
        else if (playerID == 4)
        {
            player4.removeMoney(currentProperty.getRent());
            // Add rent to owner
            if(currentProperty.getOwner() == 1)
            {
                player1.addMoney(currentProperty.getRent());
            }
            else if(currentProperty.getOwner() == 2)
            {
                player2.addMoney(currentProperty.getRent());
            }
            else if(currentProperty.getOwner() == 3)
            {
                player3.addMoney(currentProperty.getRent());
            }
        }
    }
    return;
}

public static void doBoard(int spaceLanded, int playerID)
{
    switch(spaceLanded)
    {
        case 1:
        {
            if(playerID == 1)
            {
                player1.addMoney(200);
            }
            else if(playerID == 2)
            {
                player2.addMoney(200);
            }
            else if(playerID == 3)
            {
                player3.addMoney(200);
            }
            else if(playerID == 4)
            {
                player4.addMoney(200);
            }
            break;
        }
        case 2:
        {
            checkPropertyStatus(playerID, "Mediterranean Avenue"); 
            break;
        }
        case 3:
        {
            doCommunity(playerID);
            break;
        }
        case 4:
        {
            checkPropertyStatus(playerID, "Baltic Avenue");
            
            break;
        }
        case 5:
        {
            if(playerID == 1)
            {
                player1.removeMoney(200);
            }
            else if(playerID == 2)
            {
                player2.removeMoney(200);
            }
            else if(playerID == 3)
            {
                player3.removeMoney(200);
            }
            else if(playerID == 4)
            {
                player4.removeMoney(200);
            }
            break;
        }
        case 6:
        {
            checkPropertyStatus(playerID, "Reading Railroad");
            break;
        }
        case 7:
        {   
            checkPropertyStatus(playerID, "Oriental Avenue");
            break;
        }
        case 8:
        {
            doChance(playerID);
            break;
        }
        case 9:
        {
            checkPropertyStatus(playerID, "Vermont Avenue");
            break;
        }
        case 10:
        {
            checkPropertyStatus(playerID, "Connecticut Avenue");
            break;
        }
        case 11:
        {
            //do nothing
            break;
        }
        case 12:
        {
            checkPropertyStatus(playerID, "St. Charles Place");
            break;
        }
        case 13:
        {
            checkPropertyStatus(playerID, "Electric Company");
            break;
        }
        case 14:
        {
            checkPropertyStatus(playerID, "States Avenue");
            break;
        }
        case 15:
        {
            checkPropertyStatus(playerID, "Virginia Avenue");
            break;
        }
        case 16:
        {
            checkPropertyStatus(playerID, "Pennsylvania Railroad");
            break;
        }
        case 17:
        {
            checkPropertyStatus(playerID, "St. James Place");
            break;
        }
        case 18:
        {
            doCommunity(playerID);
            break;
        }
        case 19:
        {
            checkPropertyStatus(playerID, "Tennessee Avenue");
            break;
        }
        case 20:
        {
            checkPropertyStatus(playerID, "New York Avenue");
            break;
        }
        case 21:
        {
            //do nothing
            break;
        }
        case 22:
        {
            checkPropertyStatus(playerID, "Kentucky Avenue");
            break;
        }
        case 23:
        {
            doChance(playerID);
            break;
        }
        case 24:
        {
            checkPropertyStatus(playerID, "Indiana Avenue");
            break;
        }
        case 25:
        {
            checkPropertyStatus(playerID, "Illinois Avenue");
            break;
        }
        case 26:
        {
            checkPropertyStatus(playerID, "B. & O. Railroad");
            break;
        }
        case 27:
        {
            checkPropertyStatus(playerID, "Atlantic Avenue");
            break;
        }
        case 28:
        {
            checkPropertyStatus(playerID, "Ventnor Avenue");
            break;
        }
        case 29:
        {
            checkPropertyStatus(playerID, "Water Works");
            break;
        }
        case 30:
        {
            checkPropertyStatus(playerID, "Marvin Gardens");
            break;
        }
        case 31:
        {
            //Make a Jail method
            if (playerID == 1)
            {
                player1.setPosition(10);
            }
            else if (playerID == 2)
            {
                player2.setPosition(10);
            }
            else if (playerID == 3)
            {
                player3.setPosition(10);
            }
            else if (playerID == 4)
            {
                player4.setPosition(10);
            }
            break;
        }
        case 32:
        {
            checkPropertyStatus(playerID, "Pacific Avenue");
            break;
        }
        case 33:
        {
            checkPropertyStatus(playerID, "North Carolina Avenue");
            break;
        }
        case 34:
        {
            doCommunity(playerID);
            break;
        }
        case 35:
        { 
            checkPropertyStatus(playerID, "Pennsylvania Avenue");
            break;
        }
        case 36:
        {
            checkPropertyStatus(playerID, "Short Line");
            break;
        }
        case 37:
        {
            doChance(playerID);
            break;
        }
        case 38:
        {
            checkPropertyStatus(playerID, "Park Place");
            break;
        }
        case 39:
        {
            if(playerID == 1)
            {
                player1.removeMoney(100);
            }
            else if(playerID == 2)
            {
                player2.removeMoney(100);
            }
            else if(playerID == 3)
            {
                player3.removeMoney(100);
            }
            else if(playerID == 4)
            {
                player4.removeMoney(100);
            }
            break;
        }
        case 40:
        {
            checkPropertyStatus(playerID, "Boardwalk");
            break;
        }
    }//end switch
}//end doBoard

public static void doChance(int playerID) {
    if (!chanceCards.isEmpty()) {
        String card = chanceCards.pop();
        switch (card) {
            case "Advance to Boardwalk":
                if(playerID ==1)
                {
                    player1.setPosition(39);
                }
                else if(playerID ==2)
                {
                    player2.setPosition(39);
                }
                else if(playerID ==3)
                {
                    player3.setPosition(39);
                }
                else if(playerID ==4)
                {
                    player4.setPosition(39);
                }
                break;
            case "Advance to Go (Collect $200)":
                if(playerID == 1)
                {
                    player1.setPosition(0);
                    player1.addMoney(200);
                }
                else if(playerID == 2)
                {
                    player2.setPosition(0);
                    player2.addMoney(200);
                }
                else if(playerID == 3)
                {
                    player3.setPosition(0);
                    player3.addMoney(200);
                }
                else if(playerID == 4)
                {
                    player4.setPosition(0);
                    player4.addMoney(200);
                }
                break;
            case "Advance to Illinois Avenue. If you pass Go, collect $200":
                if(playerID == 1)
                {
                    if (player1.getPosition() == 36)
                    {
                        player1.addMoney(200);
                    }
                    player1.setPosition(24);
                }
                else if(playerID == 2)
                {
                    if (player2.getPosition() == 36)
                    {
                        player2.addMoney(200);
                    }
                    player2.setPosition(24);
                }
                else if(playerID == 3)
                {
                    if (player3.getPosition() == 36)
                    {
                        player3.addMoney(200);
                    }
                    player3.setPosition(24);
                }
                else if(playerID == 4)
                {
                    if (player4.getPosition() == 36)
                    {
                        player4.addMoney(200);
                    }
                    player4.setPosition(24);
                }
            
                break;
            case "Advance to St. Charles Place. If you pass Go, collect $200":
                if(playerID == 1)
                { 
                    if ((player1.getPosition() == 36) || (player1.getPosition() == 22))
                    {
                        player1.addMoney(200);
                    }
                    player1.setPosition(11);
                }
                else if(playerID == 2)
                {
                    if ((player2.getPosition() == 36) || (player2.getPosition() == 22))
                    {
                        player2.addMoney(200);
                    }
                    player2.setPosition(11);
                }
                else if(playerID == 3)
                {
                    if ((player3.getPosition() == 36) || (player3.getPosition() == 22))
                    {
                        player3.addMoney(200);
                    }
                    player3.setPosition(11);
                }
                else if(playerID == 4)
                {
                    if ((player4.getPosition() == 36) || (player4.getPosition() == 22))
                    {
                        player4.addMoney(200);
                    }
                    player4.setPosition(11);
                }
                
                break;
            case "Advance to the nearest Railroad. If unowned, you may buy it from the Bank. If owned, pay wonder twice the rental to which they are otherwise entitled":
                if(playerID == 1)
                {
                    if(player1.getPosition() == 7)
                    {
                        player1.setPosition(15);
                    }
                    else if(player1.getPosition() == 22)
                    {
                        player1.setPosition(25);
                    }
                    else if(player1.getPosition() == 36)
                    {
                        player1.setPosition(5);
                    }
                }
                else if(playerID == 2)
                {
                    if(player2.getPosition() == 7)
                    {
                        player2.setPosition(15);
                    }
                    else if(player2.getPosition() == 22)
                    {
                        player2.setPosition(25);
                    }
                    else if(player2.getPosition() == 36)
                    {
                        player2.setPosition(5);
                    }
                }
                else if(playerID == 3)
                {
                    if(player3.getPosition() == 7)
                    {
                        player3.setPosition(15);
                    }
                    else if(player3.getPosition() == 22)
                    {
                        player3.setPosition(25);
                    }
                    else if(player3.getPosition() == 36)
                    {
                        player3.setPosition(5);
                    }
                }
                else if(playerID == 4)
                {
                    if(player4.getPosition() == 7)
                    {
                        player4.setPosition(15);
                    }
                    else if(player4.getPosition() == 22)
                    {
                        player4.setPosition(25);
                    }
                    else if(player4.getPosition() == 36)
                    {
                        player4.setPosition(5);
                    }
                }
                break;
            case "Advance token to nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times amount thrown.":
            if(playerID == 1)
            {
                if(player1.getPosition() == 7)
                {
                    player1.setPosition(12);
                }
                else if(player1.getPosition() == 22)
                {
                    player1.setPosition(28);
                }
                else if(player1.getPosition() == 36)
                {
                    player1.setPosition(12);
                }
            }
            else if(playerID == 2)
            {
                if(player2.getPosition() == 7)
                {
                    player2.setPosition(12);
                }
                else if(player2.getPosition() == 22)
                {
                    player2.setPosition(28);
                }
                else if(player2.getPosition() == 36)
                {
                    player2.setPosition(12);
                }
            }
            else if(playerID == 3)
            {
                if(player3.getPosition() == 7)
                {
                    player3.setPosition(12);
                }
                else if(player3.getPosition() == 22)
                {
                    player3.setPosition(28);
                }
                else if(player3.getPosition() == 36)
                {
                    player3.setPosition(12);
                }
            }
            else if(playerID == 4)
            {
                if(player4.getPosition() == 7)
                {
                    player4.setPosition(12);
                }
                else if(player4.getPosition() == 22)
                {
                    player4.setPosition(28);
                }
                else if(player4.getPosition() == 36)
                {
                    player4.setPosition(12);
                }
            }
                    
                break;
            case "Bank pays you dividend of $50":
                if(playerID == 1)
                {
                    player1.addMoney(50);
                }
                else if(playerID == 2)
                {
                    player2.addMoney(50);
                }
                else if(playerID == 3)
                {
                    player3.addMoney(50);
                }
                else if(playerID == 4)
                {
                    player4.addMoney(50);
                }
                    
                break;
            
            case "Go Back 3 Spaces":
            if(playerID == 1)
            {
                player1.setPosition(player1.getPosition() - 3);
            }
            else if(playerID == 2)
            {
                player2.setPosition(player2.getPosition() - 3);
            }
            else if(playerID == 3)
            {
                player3.setPosition(player3.getPosition() - 3);
            }
            else if(playerID == 4)
            {
                player4.setPosition(player4.getPosition() - 3);
            }
                            
                break;
            case "Go to Jail. Go directly to Jail, do not pass Go, do not collect $200":
            if(playerID == 1)
            {
                player1.setPosition(10);
            }
            else if(playerID == 2)
            {
                player2.setPosition(10);
            }
            else if(playerID == 3)
            {
                player3.setPosition(10);
            }
            else if(playerID == 4)
            {
                player4.setPosition(10);
            }
            
                                
                break;
            case "Speeding fine $15":
                if(playerID == 1)
                {
                    player1.removeMoney(15);
                }
                else if(playerID == 2)
                {
                    player2.removeMoney(15);
                }
                else if(playerID == 3)
                {
                    player3.removeMoney(15);
                }
                else if(playerID == 4)
                {
                    player4.removeMoney(15);
                }
                                            
                break;
            case "Take a trip to Reading Railroad. If you pass Go, collect $200":
                if(playerID == 1)
                {
                    player1.setPosition(5);
                }
                else if(playerID == 2)
                {
                    player2.setPosition(5);
                }
                else if(playerID == 3)
                {
                    player3.setPosition(5);
                }
                else if(playerID == 4)
                {
                    player4.setPosition(5);
                }

                break;
            case "You have been elected Chairman of the Board. Pay each player $50":
                if(playerID == 1)
                {
                    player1.removeMoney(150);
                    player2.addMoney(50);
                    player3.addMoney(50);
                    player4.addMoney(50);
                }
                else if(playerID == 2)
                {
                    player2.removeMoney(150);
                    player1.addMoney(50);
                    player3.addMoney(50);
                    player4.addMoney(50);
                }
                else if(playerID == 3)
                {
                    player3.removeMoney(150);
                    player1.addMoney(50);
                    player2.addMoney(50);
                    player4.addMoney(50);
                }
                else if(playerID == 4)
                {
                    player4.removeMoney(150);
                    player1.addMoney(50);
                    player2.addMoney(50);
                    player3.addMoney(50);
                }
                
                break;
            case "Your building loan matures. Collect $150":
                if(playerID == 1)
                {
                    player1.addMoney(150);
                }
                else if(playerID == 2)
                {
                    player2.addMoney(150);
                }
                else if(playerID == 3)
                {
                    player3.addMoney(150);
                }
                else if(playerID == 4)
                {
                    player4.addMoney(150);
                }
                break;  

        } //end switch
    }
}    
    

public static void doCommunity(int playerID)
{
    if (!communityCards.isEmpty()) {
        String card = communityCards.pop();
        switch (card) {
            case "Advance to Go (Collect $200)":
                if(playerID == 1)
                {
                    player1.setPosition(0);
                    player1.addMoney(200);
                }
                else if(playerID == 2)
                {
                    player2.setPosition(0);
                    player2.addMoney(200);
                }
                else if(playerID == 3)
                {
                    player3.setPosition(0);
                    player3.addMoney(200);
                }
                else if(playerID == 4)
                {
                    player4.setPosition(0);
                    player4.addMoney(200);
                }
                
                break;
                
            case "Bank error in your favor. Collect $200":
                if(playerID == 1)
                {
                    player1.addMoney(200);
                }
                else if(playerID == 2)
                {
                    player2.addMoney(200);
                }
                else if(playerID == 3)
                {
                    player3.addMoney(200);
                }
                else if(playerID == 4)
                {
                    player4.addMoney(200);
                }
                
                break;
            case "Doctor’s fee. Pay $50":
                if(playerID == 1)
                {
                    player1.removeMoney(50);
                }
                else if(playerID == 2)
                {
                    player2.removeMoney(50);
                }
                else if(playerID == 3)
                {
                    player3.removeMoney(50);
                }
                else if(playerID == 4)
                {
                    player4.removeMoney(50);
                }
                
                break;
            
            case "From sale of stock you get $50":
                if(playerID == 1)
                {
                    player1.addMoney(50);
                }
                else if(playerID == 2)
                {
                    player2.addMoney(50);
                }
                else if(playerID == 3)
                {
                    player3.addMoney(50);
                }
                else if(playerID == 4)
                {
                    player4.addMoney(50);
                }
                
                break;
            
            case "Go to Jail. Go directly to jail, do not pass Go, do not collect $200":
                if(playerID == 1)
                {
                    player1.setPosition(10);
                }
                else if(playerID == 2)
                {
                    player2.setPosition(10);
                }
                else if(playerID == 3)
                {
                    player3.setPosition(10);
                }
                else if(playerID == 4)
                {
                    player4.setPosition(10);
                }
                    
                break;
            case "Holiday fund matures. Receive $100":
                if(playerID == 1)
                {
                    player1.addMoney(100);
                }
                else if(playerID == 2)
                {
                    player2.addMoney(100);
                }
                else if(playerID == 3)
                {
                    player3.addMoney(100);
                }
                else if(playerID == 4)
                {
                    player4.addMoney(100);
                }

                
                break;
            case "Income tax refund. Collect $20":
                if(playerID == 1)
                {
                    player1.addMoney(20);
                }
                else if(playerID == 2)
                {
                    player2.addMoney(20);
                }
                else if(playerID == 3)
                {
                    player3.addMoney(20);
                }
                else if(playerID == 4)
                {
                    player4.addMoney(20);
                }
                
                break;
            case "It is your birthday. Collect $10 from every player":
                if(playerID == 1)
                {
                    player1.addMoney(30);
                    player2.removeMoney(10);
                    player3.removeMoney(10);
                    player4.removeMoney(10);
                }
                else if(playerID == 2)
                {
                    player2.addMoney(30);
                    player1.removeMoney(10);
                    player3.removeMoney(10);
                    player4.removeMoney(10);
                }
                else if(playerID == 3)
                {
                    player3.addMoney(30);
                    player1.removeMoney(10);
                    player2.removeMoney(10);
                    player4.removeMoney(10);
                }
                else if(playerID == 4)
                {
                    player4.addMoney(30);
                    player1.removeMoney(10);
                    player2.removeMoney(10);
                    player3.removeMoney(10);
                }
                    
                break;
            case "Life insurance matures. Collect $100":
                if(playerID == 1)
                {
                    player1.addMoney(100);
                }
                else if(playerID == 2)
                {
                    player2.addMoney(100);
                }
                else if(playerID == 3)
                {
                    player3.addMoney(100);
                }
                else if(playerID == 4)
                {
                    player4.addMoney(100);
                }
                
                break;
            case "Pay hospital fees of $100":
                if(playerID == 1)
                {
                    player1.removeMoney(100);
                }
                else if(playerID == 2)
                {
                    player2.removeMoney(100);
                }
                else if(playerID == 3)
                {
                    player3.removeMoney(100);
                }
                else if(playerID == 4)
                {
                    player4.removeMoney(100);
                }
                    
                break;
            case "Pay school fees of $50":
                if(playerID == 1)
                {
                    player1.removeMoney(50);
                }
                else if(playerID == 2)
                {
                    player2.removeMoney(50);
                }
                else if(playerID == 3)
                {
                    player3.removeMoney(50);
                }
                else if(playerID == 4)
                {
                    player4.removeMoney(50);
                }
                    
                break;
            case "Receive $25 consultancy fee":
                if(playerID == 1)
                {
                    player1.addMoney(25);
                }
                else if(playerID == 2)
                {
                    player2.addMoney(25);
                }
                else if(playerID == 3)
                {
                    player3.addMoney(25);
                }
                else if(playerID == 4)
                {
                    player4.addMoney(25);
                }
                    
                break;
         
            case "You have won second prize in a beauty contest. Collect $10":
                if(playerID == 1)
                {
                    player1.addMoney(10);
                }
                else if(playerID == 2)
                {
                    player2.addMoney(10);
                }
                else if(playerID == 3)
                {
                    player3.addMoney(10);
                }
                else if(playerID == 4)
                {
                    player4.addMoney(10);
                }
                        
                break;
            case "You inherit $100":
                if(playerID == 1)
                {
                    player1.addMoney(100);
                }
                else if(playerID == 2)
                {
                    player2.addMoney(100);
                }
                else if(playerID == 3)
                {
                    player3.addMoney(100);
                }
                else if(playerID == 4)
                {
                    player4.addMoney(100);
                }
                            
                break;

            // Add morecases as needed
        } //end switch
    }
}

 


//switch statement for community chest cards


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