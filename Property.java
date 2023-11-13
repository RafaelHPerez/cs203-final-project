
    public class Property{ 
        public String name; 
        public String color;
        public int cost;
        public int rent;
        public int mortgage;
        public int houseCost;
        public int hotelCost;
        public int houses;
        public int hotels;
        public Player owner;
        public boolean mortgaged;
        public Property(int cost, int rent, int mortgage, int houseCost, int hotelCost, String name, String color){
            this.cost = cost;
            this.rent = rent;
            this.mortgage = mortgage;
            this.houseCost = houseCost;
            this.hotelCost = hotelCost;
            this.name = name;
            this.color = color;
            this.houses = 0;
            this.hotels = 0;
            this.mortgaged = false;
            this.owner = -1;
        }

       
    

}