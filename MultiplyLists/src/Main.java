/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner scan = new Scanner((file));
        Scanner num;
        int[] numbers;
        String str;
        int j;
        while(scan.hasNext())
        {
            str = scan.nextLine();
            
            numbers = new int[str.split(" ").length-1];
            num = new Scanner(str);
            j = 0;
            while(num.hasNext())
            {
                str = num.next();
                if(!str.equals("|"))
                {
                    numbers[j] = Integer.parseInt(str);
                    j++;
                }
                str = "";
                
            }
            int k = numbers.length / 2;
            for(int i=0;i<numbers.length / 2;i++)
            {
                str += " " + (numbers[i] * numbers[k++]);                
            }
            System.out.println(str);
            
        }
    }
    
}
