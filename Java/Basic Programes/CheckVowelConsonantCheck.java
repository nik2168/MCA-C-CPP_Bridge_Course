import java.util.*;

public class CheckVowelConsonantCheck {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        
        char a = sc.next().charAt(0);
        
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U'){
            System.out.println("Its a vowel");
        }
        else System.out.println("Its a consonant");

        sc.close();
    }
}
