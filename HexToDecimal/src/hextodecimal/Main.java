/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hextodecimal;


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
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        File file = new File(args[0]);
        Scanner scan = new Scanner(file);
        String number;
        Scanner scanNum;
        int decValue;
        int power;
        while(scan.hasNext())
        {
            number = scan.next();
            scanNum = new Scanner(number);
            scanNum.useDelimiter("");
            power = number.length() -1;
            decValue = 0;
            while(scanNum.hasNext())
            {
                decValue += getDecValue(scanNum.next()) * Math.pow(16, power);
                power--;
            }
            System.out.println(decValue);
        }
        scan.close();
        System.exit(0);
    }

    public static int getDecValue(String value){
        switch(value){
            case "a":
                return 10;                
            case "b":
                return 11;
            case "c":
                return 12;                
            case "d":
                return 13;                
            case "e":
                return 14;                
            case "f":
                return 15;                
            default:
                return Integer.parseInt(value);
        }
    }
}
