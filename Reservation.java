public class Reservation {
   Guest guest;
   Room room;
   int nights = 2;
   double tCost = 0;
   
   // Constructor 
   public Reservation(Room theRoom, Guest g, int n)
   {
      room = theRoom;
      guest = g;
      nights = n;     
   }
   
   // Setter #1
   public void setNights(int n) {
      nights = n;
  }
   // Setter #2
   public void setTCost(double c) {
      tCost = c;
     }
   
   // Getter #1
   public int getNights() {
      return nights;
   }
   
   // Getter #2
   public double tCost() {
      return tCost;
   }
   
   // If and Else Method to see if Room is Avaliable and the Cost of the Room if it is
   public boolean isAvailable(){
      if (room.ifRoomReserved()){
            System.out.println("Reservation Impossible " + room + " is already Reserved!");
            return false;
     }  
       else
      { 
            System.out.println("Room " + room + " is avaliable");

            return true;
      }
   }
   
   // This is calculating the cost and will return it
   public double calculateCost()
   {
      double cost = tCost * nights; 
      if(guest.GetExecutiveMemebers())
      {
         cost = (tCost - (tCost * 0.1));
      }
      return cost;
     
     // if eMemember is true reduce by 10%   
  
  }     
}