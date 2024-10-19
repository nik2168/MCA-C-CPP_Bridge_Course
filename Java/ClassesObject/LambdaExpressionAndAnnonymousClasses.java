// lamda express lets as create instance of a class without defining it


 interface Demo {
public void info();
}

public class LambdaExpressionAndAnnonymousClasses {
    public static void main(String[] args) {
        Demo a = new Demo() {   // here we created obj with anonymous class without create any class also with interface methods
            public void info(){
                System.out.println("Hello");
            }
        };
        a.info();

        Demo b = () -> {
            System.out.println("Hello from lambda expresssion !");
        };
        b.info();  // kind of like arrow function works on only interfaces with one function
        // can overide that one function in a interface using lamba experession .. () -> {`}
    }
}
