/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowercase;


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
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner scan = new Scanner(file);
        Scanner scanLine;
        String line, output;
        
        while(scan.hasNextLine())
        {
            line = scan.nextLine();
            scanLine = new Scanner(line);
            scanLine.useDelimiter("");
            output = "";
            while(scanLine.hasNext())
            {
                output += toLCase(scanLine.next());
            }
            System.out.println(output);
        }
    }
    
    
    public static String toLCase(String input){
        Character a = input.charAt(0);
        if(a >= 65 && a <= 90)
            a = (char) (a+32);
        
        return a.toString();
        
        
    }
}
