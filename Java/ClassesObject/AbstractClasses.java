
// by default classes are package private

abstract class Shape{

   abstract double calculateArea();

   void display(){
    System.out.println("This is a shape");
   }

}

class Circle extends Shape{
 
    double radius;

Circle(double radius){
    this.radius = radius;
}

double calculateArea(){
    return (22/7) * (radius * radius);
}


}

class Rectangle extends Shape{
    double length;
    double breath;
    Rectangle(double length, double breath){
        this.length = length;
        this.breath = breath;
    }

    double calculateArea(){
        return length * breath;
    }
}


public class AbstractClasses {

    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(3, 3);
        System.out.println("Area of circle is : " + circle.calculateArea()+ " &  Area of reactangle is : " + rectangle.calculateArea());
    }
    
}
