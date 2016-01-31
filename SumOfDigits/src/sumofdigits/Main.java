/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofdigits;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File(args[0]);
        
        Scanner scan = new Scanner(file);
        String line;
        int n, sum = 0;
        Scanner scanNum;
        while(scan.hasNext())
        {
            scanNum = new Scanner(scan.next());
            scanNum.useDelimiter("");
            sum = 0;
            while(scanNum.hasNext())
            {
                sum += scanNum.nextInt();            
            }
            System.out.println(sum);
        
        }
    }
    
}
