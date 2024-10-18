// This is an example of Run Time Polymorphism
class Animal{
    void printThis(){
        System.out.println("Animal say Hi !");
    }
}

class Dog extends Animal{
    void printThis(){
        System.out.println("Dog says Hi!");
    }
}

public class PolymorphismClass {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.printThis();
    }
}
