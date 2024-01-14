public class Test {
public static void main(String[] args)
   {
      
      // Instantiation of Room Class 
      // This will be in-order which is rNumber and the Cost of the Room
      Room roomA = new Room(125,45.23);
      Room roomB = new Room(216,98.99);
      Room roomC = new Room(343,145.00);
      
      // Instantiation of Guest Class
      // This will be in-order which is gName and if there Exclusive Members and more
      Guest guestA = new Guest("Owen Grady", false);
      Guest guestB = new Guest("Andrew Dywer", false);
      Guest guestC = new Guest("Peter Quill", true);
      
      // Instantiation of Reservation Class
      // It will be in-order which is Room, How Many Nights, The Cost of the Room
      Reservation reservationA = new Reservation(roomA, guestA, 3);
      Reservation reservationB = new Reservation(roomB, guestB, 5);
      Reservation reservationC = new Reservation(roomC, guestC, 4);
      
      
      // Checking if Room is Avaliable for Reservation A
      if (reservationA.isAvailable())
      {
         double finalCost = reservationA.calculateCost();
         System.out.println(guestA.guestName + " will be staying in room " + roomA.roomNumber);
      }
      else
        System.out.println("Sorry " + guestA.guestName + " Is staying in " + roomA.roomNumber);
   }
}

    // Checking if Room is Avaliable for Reservation B
    if (reservationB.isAvailable())
    {
      double finalCost = reservationB.calculateCost();
      System.out.prinln(guestB.guestName + " will be staying in room " + roomB.roomNumber);
    }
    else
      System.out.println("Sorry " + guestB.guestName + " Is staying in " + roomB.roomNumber);
      
   
   // Checking if Room is Avaliable for Reservation C
   if(reservationC.isAvailable())
   {
      double finalCost = reservationC.calculateCost();
      System.out.println(guestC.guestName + " will be staying in room " + roomC.roomNumber);
   }
   else
      System.out.println("Sorry " + guestC.guestName + " Is staying in " + roomC.roomNumber); 
      
    { 
}