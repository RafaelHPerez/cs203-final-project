
    public class Property{ 
        public String name; 
        public String color;
        public int cost;
        public int rent;
        public int colorset;
        public int house1;
        public int house2;
        public int house3;
        public int house4;
        public int hotel;
        public int mortgage;
        public int buildingCost;
        public int houses;
        public int hotels;
        public int owner;
        public int owned2;
        public int owned3;
        public int owned4;
        public boolean mortgaged;

        //regular property constructor
        public Property(String name, String color, int cost, int rent, int colorset, int house1,int house2, int house3,int house4, int hotel, int mortgage, int buildingCost){
            this.name = name;
            this.color = color;
            this.cost = cost;
            this.rent = rent;
            this.colorset = colorset;
            this.house1 = house1;
            this.house2 = house2;
            this.house3 = house3;
            this.house4 = house4;
            this.hotel = hotel;
            this.mortgage = mortgage;
            this.buildingCost = buildingCost;
            this.houses = 0;
            this.hotels = 0;
            this.mortgaged = false;
            this.owner = 0;

        }
        
        //utility constructor
        public Property(String name, int cost, int rent, int mortgage){
        this.name = name;
        this.cost = cost;
        this.rent = rent;
        this.mortgage = mortgage;
        this.owner = 0;
        this.mortgaged = false;
        }

        //railroad constructor
        public Property(String name, int cost, int rent, int owned2,int owned3, int owned4,  int mortgage){
        this.name = name;
        this.cost = cost;
        this.rent = rent;
        this.mortgage = mortgage;
        this.owner = 0;
        this.owned2 = owned2;
        this.owned3 = owned3;
        this.owned4 = owned4;
        this.mortgaged = false;
        }
        
        public boolean isOwned(){
            if(this.owner == 0){
                return false;
            }
            else{
                return true;
            }
        }

        public int getOwner(){
            return this.owner;
        }

        
        // generate getters and setters
        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getColor(){
            return this.color;
        }
        public void setColor(String color){
            this.color = color;
        }
        public int getCost(){
            return this.cost;
        }
        public void setCost(int cost){
            this.cost = cost;
        }



        // Create get rent for regular properties
        // And another for railroads and another for utilities
        public int getRent(){
            return this.rent;
        }



        public void setRent(int rent){
            this.rent = rent;
        }
        public int getColorset(){
            return this.colorset;
        }
        public void setColorset(int colorset){
            this.colorset = colorset;
        }
        public int getHouse1(){
            return this.house1;
        }
        public void setHouse1(int house1){
            this.house1 = house1;
        }
        public int getHouse2(){
            return this.house2;
        }
        public void setHouse2(int house2){
            this.house2 = house2;
        }
        public int getHouse3(){
            return this.house3;
        }
        public void setHouse3(int house3){
            this.house3 = house3;
        }
        public int getHouse4(){
            return this.house4;
        }
        public void setHouse4(int house4){
            this.house4 = house4;
        }
        public int getHotel(){
            return this.hotel;
        }
        public void setHotel(int hotel){
            this.hotel = hotel;
        }
        public int getMortgage(){
            return this.mortgage;
        }
        public void setMortgage(int mortgage){
            this.mortgage = mortgage;
        }
        public int getBuildingCost(){
            return this.buildingCost;
        }
        public void setBuildingCost(int buildingCost){
            this.buildingCost = buildingCost;
        }
        public int getHouses(){
            return this.houses;
        }
        public void setHouses(int houses){
            this.houses = houses;
        }
        public int getHotels(){
            return this.hotels;
        }
        public void setHotels(int hotels){
            this.hotels = hotels;
        }
        public void setOwner(int owner){
            this.owner = owner;
        }
        public int getOwned2(){
            return this.owned2;
        }
        public void setOwned2(int owned2){
            this.owned2 = owned2;
        }
        public int getOwned3(){
            return this.owned3;
        }
        public void setOwned3(int owned3){
            this.owned3 = owned3;
        }
        public int getOwned4(){
            return this.owned4;
        }
        public void setOwned4(int owned4){
            this.owned4 = owned4;
        }
        public boolean getMortgaged(){
            return this.mortgaged;
        }
        public void setMortgaged(boolean mortgaged){
            this.mortgaged = mortgaged;
        }

        // public int getRent(){

        //.
        //     if(player lands on utility && player owns one utilities)
        //     {
        //         rent = 4 * rollofdice();
        //     }
        //     else if(player lands on utility && player owns both  utility
        //     {
        //         rent = 10 * rollofdice();
        //     else 
        //     {
        //         rent = 10 * dice roll
        //     }
        //     if ( player lands on utility && it is not owned)
        //     {

        //     }
    
       
    

}




//name, color, cost, site, Mortgage, Building cost