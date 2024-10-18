import java.util.*;

public class FactorialOfANumber {
    public static void main(String[] arg){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a number ");
           int number = sc.nextInt();
           int factorial = 1;
           for(int i = 1; i <= number; i++){
                   factorial *= i;
           }
           System.out.println(factorial);
           sc.close();
    }
}
