/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong;


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
        Scanner scanNum;
        String line;
        int armstrong;
        while(scan.hasNext())
        {
            line = scan.next();
            scanNum = new Scanner(line);
            scanNum.useDelimiter("");
            armstrong = 0;
            while(scanNum.hasNext())
            {
                armstrong += Math.pow(Integer.parseInt(scanNum.next()), line.length());
            }
            System.out.println(armstrong == Integer.parseInt(line) ? "True" : "False");
        }
    }
    
}
