/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversewords;


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
        String lines[], output;
        while(scan.hasNextLine())
        {
            output = "";
            lines = scan.nextLine().split(" ");
            for(int i=lines.length-1;i>=0;i--)
            {
                output += " " + lines[i];
            }        
            System.out.println(output.trim());
        }
        
        scan.close();
    }
    
}
