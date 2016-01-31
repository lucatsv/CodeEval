/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trytosolveit;

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
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner scan = new Scanner(file);
        Scanner scanLine;
        String line, letter;
        while(scan.hasNext())
        {
            line = scan.next();
            scanLine = new Scanner(line);
            scanLine.useDelimiter("");            
            line = "";
            while(scanLine.hasNext())
            {
                letter = scanLine.next();
                line += translateLetter(letter);
            }
            System.out.println(line);
            scanLine.close();
        }
        scan.close();
        System.exit(0);
    }
    
    public static String translateLetter(String input){
        char c = input.charAt(0);
        if(c >= 97 && c<= 102)
        {
            c += 20;
        }
        else if(c >= 117 && c<= 122)
        {
            c -= 20;
        }
        else if(c >= 103 && c<= 109)
        {
            c += 7;
        }        
        else if(c >= 110 && c<= 116)
        {
            c -= 7;
        }        
        return (c+"");
    }
}
