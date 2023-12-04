
    public class Property{ 
        public String name; 
        public String color;
        public int cost;
        public int rent;
        public int mortgage;
        public int buildingCost;
        public int houses;
        public int hotels;
        public int owner;
        public boolean mortgaged;
        public Property(String name, String color, int cost, int rent, int mortgage, int buildingCost){
            this.name = name;
            this.color = color;
            this.cost = cost;
            this.rent = rent;
            this.mortgage = mortgage;
            this.buildingCost = buildingCost;
            this.houses = 0;
            this.hotels = 0;
            this.mortgaged = false;
            this.owner = 0;
        }
        
        //utility and railroad constructor
        public Property(String name, int cost, int rent, int mortgage){
        this.name = name;
        this.cost = cost;
        this.rent = rent;
        this.mortgage = mortgage;
        this.owner = 0;
        this.mortgaged = false;
        }
        
        
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