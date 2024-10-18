import java.util.*;


public class TryCatchClass{
public static void main(String arg []){
    
    int marks [] = new int[3];
    marks[0] = 1;
    marks[1] = 30;
    marks[2] = 40;
    Scanner s = new Scanner(System.in);

    int index = s.nextInt();

    try {
        int res = marks[index]/2;
        System.out.println(res);
    } catch (ArithmeticException e) {
        System.out.println(e + "some bad here !");
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e + "some bad here !");
    } catch (Exception e) {
        System.out.println(e + "some bad here !");
    } finally{
        System.out.println("Error/Output throwed successfully !");
    }

}
}
