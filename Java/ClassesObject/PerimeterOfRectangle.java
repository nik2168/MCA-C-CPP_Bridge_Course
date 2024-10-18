class Rectangle{
     protected int width;
     protected int length;

     Rectangle (int width, int length){
         this.width = width;
         this.length = length;
     }

    public int perimeter (){
        return 2 * (this.length * this.width);
     }
}

class Box extends Rectangle{
    protected int height;

    Box (int width, int length, int height){
        super(width, length);
         this.height = height;
    }

   public int perimeter () {
        return 4 * (length + width + height);
    } 

}



class PerimeterOfRectangle{
    public static void main(String[] args) {

        Rectangle r = new Rectangle(3, 4);
        int rectanglePerimeter = r.perimeter(); 
        System.out.println(rectanglePerimeter);

       Box b = new Box(3,3,3);
       int boxPerimeter = b.perimeter();
       System.out.println(boxPerimeter);
    }
}