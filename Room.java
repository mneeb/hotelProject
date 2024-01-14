public class Room { 
      
      // Instance Variables  
      public int roomNumber;
      public double perNight;
      public boolean ifRoomReserved;
      
      // Constructor
      public Room(int rNumber, double pNight) 
      {
         roomNumber = rNumber;
         perNight = pNight;
         ifRoomReserved = false;
      }
      
   
   // Getter #1
      public int roomNumber() {
         return roomNumber;
      }
   
   // Getter #2
      public double perNight() {
         return perNight;
      }
      
   // Getter #3 
      public boolean ifRoomReserved() {
         return ifRoomReserved;     
      }                               

  
   // Setter #1
      public void setroomNumber(int r)
      {
         roomNumber = r;
      }
      
   // Setter #2
      public void setPerNight(double p)
      {   
         perNight = p;
      }
  // Setter #3
      public void setRoomReserved(boolean res)
      {
         ifRoomReserved = res;
      }
      
// Don't use Main Method in Class
// Using Private instead of Public


}