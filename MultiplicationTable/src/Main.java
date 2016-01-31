/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String line;
        for(int i=0;i<12;i++)
        {
            line = "";
            for(int j=0;j<12;j++)
            {
                line +=  formatNumber((i+1)*(j+1));
            }        
            System.out.println(line);
        }
    }
    
    public static String formatNumber(int number)
    {
        
        if(number <= 9)
        {
            return ("   " + number);
        }
        else if(number <= 99)
        {
            return ("  " +number);
        }
        else
            return (" " +number);
    }
}
