// ************************************************************
// Distance.java
// Computes the distance between two points
// ************************************************************
/*

@author Lucas Terra Vieira
SEP/02/2015
*/
package distance;

import java.util.Scanner;

public class Distance
{
    public static void main(String[] args)
    {
        double x1, y1, x2, y2;  // coordinates of two points
        double distance;        // distance between the points
               
        Scanner scan = new Scanner(System.in);
        // Read in the two points
        System.out.print ("Enter the coordinates of the first point " +
        "(put a space between them): ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        System.out.print ("Enter the coordinates of the second point: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        // Compute the distance
        distance = Math.pow((x1 - x2),2) + Math.pow((x1 - x2),2);
        distance  = Math.sqrt(distance);        
        // Print out the answer        
        System.out.println("The point (" + x1 + "," + y1 + ") is " + distance + "distant from the point (" + x2 + "," + y2 + ")");
    }
}