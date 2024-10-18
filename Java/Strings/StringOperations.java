import java.util.Scanner;


class CustomString {
    private String str;

    public CustomString(String str){
        this.str = str;
    }

    // check equals case-sensitive
    public boolean equals(CustomString other){
        return this.str.equals(other.str);
    }

    // check equals non-case sensitive
    public boolean equalsIgnoreCase(CustomString other){
        return this.str.equalsIgnoreCase(other.str);
    }

    // reverse a string
    public String reverse(){
        StringBuilder reversed = new StringBuilder(this.str);
        return reversed.reverse().toString();
    }

    // getting method to return the original string
    public String getString(){
        return this.str;
    }
}

public class StringOperations {


    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

      String inpuString = sc.nextLine();

      String inpuString2 = sc.nextLine();
      sc.close();

      CustomString a = new CustomString(inpuString);
      CustomString b = new CustomString(inpuString2);

      // print result of compare string with case sensitive
      boolean result = a.equals(b);
      System.out.println(result);

      // print result without case sesitive equal check
      boolean resultWithoutCS = a.equalsIgnoreCase(b);
      System.out.println(resultWithoutCS);

      // print result reverse the string
      System.out.println(a.reverse());

      // print both og strings
      System.out.println(a.getString());
      System.out.println(b.getString());

    }
}
