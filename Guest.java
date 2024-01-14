public class Guest {
      public String guestName;
      public boolean ifExecutiveMembers;
      
      // Constructor
      
      public Guest(String gName, boolean eMembers)
      {
         guestName = gName;
         ifExecutiveMembers = eMembers;
      }
      
      // Setter #1
      public void setGuestName(String g) {
            guestName = g;
      }
      
      // Setter #2
      public void setExecutiveMembers(boolean e) {
            ifExecutiveMembers = e;
      }
      
      // Getter #1
      public String GetguestName() {
            return guestName;
      }
      
      // Getter #2
      public boolean GetExecutiveMemebers() {
            return ifExecutiveMembers;
      }
}