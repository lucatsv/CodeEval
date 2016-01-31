//********************************************************************
//  Stars.java       Author: Lewis/Loftus
//
//  Demonstrates the use of nested for loops.
//********************************************************************
import java.util.ArrayList;
public class Stars
{
   //-----------------------------------------------------------------
   //  Prints a triangle shape using asterisk (star) characters.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      final int MAX_ROWS = 10;
      ArrayList<String> spaces = new ArrayList(); 
      String line = "";
      
      for (int row = 1; row <= MAX_ROWS; row++)
      {
        for(int i = 0; i< (MAX_ROWS - row)/2; i++)
             line = line + " ";
        spaces.add(line);
         // print stars, number of stars from 1 to row. 
         for (int star = 1; star <= row; star++)
         {
            System.out.print(spaces.get(row) + "" + star);
             //System.out.print("" + star);
         }

         System.out.println();
      }
   }
}
