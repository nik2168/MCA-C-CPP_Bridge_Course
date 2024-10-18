import java.util.*;

public class CheckEvenOdd {
    public static void main(String[] arg){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number ");
          int number = sc.nextInt();
          if(number % 2 == 0){
                System.out.println("The number is even");
          }else{
            System.out.println("The number is odd");
          }
          sc.close();
    }
}
