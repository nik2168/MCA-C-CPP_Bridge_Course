

class NegativeRadiusException extends Exception{
    
    @override
    public String toString(){
        return "Radius can't be negative !";
    }

    @override
    public String getMessage() {
            return "Radius can't be negative !";
    }

}

public class ThrowThrows {


    public static double area(int r) throws NegativeRadiusException{

        if(r < 0) throw new NegativeRadiusException();

        return Math.PI * r * r;
    }

    // throws will tell earlier if there is an error chances to be occured in any specific function then we can use throws to show kind
    // of stuff !

    public static int divide(int a, int b) throws ArithmeticException{ 
                return a/b;
    }


 public static void main(String[] args) {


    // try {
        
    //        int result = divide(3, 0);

    //    System.out.println("The result is " + result);

    // } catch (ArithmeticException e) {
    //     System.out.println(e);
    // }

    try {
        double res2 = area(-6);
        System.out.println(res2);
    } catch (Exception e) {
        System.out.println(e);
    }
    
 }    
}
