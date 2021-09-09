import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {
        area();
        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius of the circle"));
        double area = Math.PI * Math.pow(radius, 2);
        //create and run the program

    }

    //re-write the method to calculate a circle's area using parameters
     public static void area(double radius, double method) {
        double area = radius;
         DecimalFormat round = new DecimalFormat("#, ##");
         JOptionPane.showMessageDialog(null, " The area is " + round.format(area));
     }

    //re-write the method to calculate a circle's perimeter using parameters



}
