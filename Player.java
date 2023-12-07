import java.util.*;
public class Player{

public String Name;
public int PlayerID;
public int funds;
public int position;


public Player ()
{
    this.Name = "";
    this.PlayerID = 0;
    this.funds = 1500;
    this.position = 0;
}

public void removeMoney(int amount)
{
    this.funds = this.funds - amount;
}
public void addMoney(int amount)
{
    this.funds = this.funds + amount;
}
public boolean wantsToBuyProperty(String propertyName, int cost)
{
    System.out.println("You have $" + this.funds + " in your account.");
    System.out.println("The property you landed on is " + propertyName + ".");
    System.out.println("It costs $" + cost + ". (remember at 0 funds you lose)");
    Scanner input = new Scanner(System.in);
    System.out.println("Do you want to buy " + propertyName + "? (y/n)");
    String answer = input.nextLine();
    if(answer.equals("y"))
    {
        return true;
    }
    else
    {
        return false;
    }
}

 
    public void setPlayerID(int playerID) {
        this.PlayerID = playerID;
    }
    public int getPlayerID() {
        return PlayerID;
    }
    public void setFunds(int funds) {
        this.funds = funds;
    }
    public int getFunds() {
        return funds;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public int getPosition() {
        return position;
    }
 


//method to store what  buildings each player has 
// public static void buildings ()//takes a data struture that has the buildings 
// {
//     //add some code to make a data structure that holds player data. 
//     //if(data structure con -big bomb- -Bandz gzdtians what space the player is on){print out do you want to buy it? type y for yes and n for n.
//         //add more if statements that thak say how much each building is and how much anther player pays if they land on i
//     // for the different buildings. }
//you cant t// }//end of buildings method.

}//end of class

//

//method to store what  buildings each player has 
// public static void buildings ()//takes a data struture that has the buildings 
// {
//     //add some code to make a data structure that holds player data. 
//     //if(data structure contians what space the player is on){print out do you want to buy it? type y for yes and n for n.
//         //add more if statements that thak say how much each building is and how much anther player pays if they land on i
//     // for the different buildings. }
// }//end of buildings method.




// need a getmoney method

//end of class