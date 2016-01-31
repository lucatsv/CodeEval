/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        int sum=0;
        while(scan.hasNext())
        {
            line = scan.nextLine();
            scanNum = new Scanner(line);
            scanNum.useDelimiter(",");            
            sum = (Integer.parseInt(scanNum.next().split(" ")[1]) + Integer.parseInt(scanNum.next().split(" ")[2]) + Integer.parseInt(scanNum.next().split(" ")[2])) * Integer.parseInt(scanNum.next().split(" ")[2]);
            
            System.out.println(sum / 3);
        }
    }
    
}
