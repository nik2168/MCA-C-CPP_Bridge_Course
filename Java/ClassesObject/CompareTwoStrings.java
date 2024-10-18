// Custom String class
class CustomString {
   private String str;
 
   // Constructor to initialize the string
   public CustomString(String str) {
       this.str = str;
   }
 
   // Method to check if two strings are equal (case-sensitive)
   public boolean equals(CustomString other) {
       return this.str.equals(other.str);
   }
 
   // Method to check if two strings are equal (case-insensitive)
   public boolean equalsIgnoreCase(CustomString other) {
       return this.str.equalsIgnoreCase(other.str);
   }
 
   // Method to reverse the string
   public String reverse() {
       StringBuilder reversed = new StringBuilder(this.str);
       return reversed.reverse().toString();
   }
 
   // Getter method to return the original string
   public String getString() {
       return this.str;
   }
}

public class CompareTwoStrings {
    public static void main(String[] args) {
          CustomString a = new CustomString("NIK");
          CustomString b = new CustomString("Nik");
          boolean res1 =  a.equals(b);
          boolean res2 = a.equalsIgnoreCase(b);
      if(res1){
        System.out.println("True");
      }
      else{
        System.out.println("False");
      }
      if(res2){
        System.out.println("True");
      }
      else{
        System.out.println("False");
      }

    }
}
