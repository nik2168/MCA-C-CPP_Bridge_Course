import first.Rectangle;

// byte code is compiled by jvm to convert in binary to run it easily o different operating systems
// java c = compiler
// jvm = java virtual machine
 // user to run the program
 // java = interpreter 
 // java is a compiler and a interpretor language
 // java code -> source code -> compiler -> byte code -> jvm(interpretor) -> machine code
 // javac present in jdk folder and to access the program that we made we need to keep our mai function public
//  protected class can be accessable on the different package subclass only in java

public class MainStuff {
public static void main(String[] args) {
     Rectangle a = new Rectangle();
     a.printInfo();
     a.getClass();
}    
}
