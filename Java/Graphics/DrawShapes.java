import javax.swing.*;
import java.awt.*;
 
public class DrawShapes extends JPanel {
 
   @Override
   protected void paintComponent(Graphics g) {
       super.paintComponent(g);
 
       // Draw a rectangle
       g.setColor(Color.RED); // Set color for the rectangle
       g.drawRect(50, 50, 200, 100); // Draw a rectangle (x, y, width, height)
 
       // Draw an oval
       g.setColor(Color.BLUE); // Set color for the oval
       g.drawOval(300, 50, 200, 100); // Draw an oval inside a bounding rectangle
 
       // Draw a line
       g.setColor(Color.GREEN); // Set color for the line
       g.drawLine(50, 200, 500, 200); // Draw a line (x1, y1, x2, y2)
 
       // Draw text
       g.setColor(Color.BLACK); // Set color for the text
       g.drawString("This is some text!", 50, 250); // Draw text (text, x, y)
   }
 
   public static void main(String[] args) {
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(600, 400);
       frame.add(new DrawShapes());
       frame.setVisible(true);
   }
}