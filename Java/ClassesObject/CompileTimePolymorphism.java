
// This is a example of compile time polymorphism
// function overloading

class Sum{
    void printRes(int a, int b){
        System.out.println(a + b);
    }

    void printRes(int a, int b, int c){
        System.out.println(a*b*c);
    }
}


public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Sum a = new Sum();
        a.printRes(1,2);
        a.printRes(3, 3, 3);
    }
}
