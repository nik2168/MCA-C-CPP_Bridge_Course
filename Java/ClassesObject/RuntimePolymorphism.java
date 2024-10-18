

// this is an example of function overiding during runtime polymorphism


class Mango{
    String name;

    Mango (String name){
        this.name = name;
    }

   void printName () {
    System.out.println("Hey !, I'm a mango !");
   }
}

class Apple extends Mango{

    String name;

    Apple (String name){
        super("Mango");
        this.name = name;
    }
  
    void printName () {
        System.out.println("Hey !, I'm an Apple");
    }

}


public class RuntimePolymorphism {
    public static void main(String[] args) {
        Apple a = new Apple("Three");
         a.printName();
    }
}
