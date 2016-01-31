/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner scan = new Scanner(file);
        String line;
        int sum;
        boolean alternate;        
        sum = 0;
        alternate = false;
        String state = "";
        while(scan.hasNext())
        {
            scan.useDelimiter("");
            line = scan.next();
            if(!line.equals("\r") && !line.equals(" ") && !line.equals("\n"))
            {   
                sum += alternate ? Integer.parseInt(line) : Integer.parseInt(line) * 2;        
                alternate = !alternate;
            }
            else
            {   
                if(line.equals("\n"))
                {
                    state = (sum % 10 == 0) ? "Real" : "Fake";
                    System.out.println(state);
                    sum = 0;
                    alternate = false;
                }
            }            
        }
        System.out.println(state);
    }
    
}
