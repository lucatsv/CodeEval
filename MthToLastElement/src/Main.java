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
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
    
        FileInputStream file = new FileInputStream(args[0]);
        Scanner scan = new Scanner(file);
        String values[], value;
        int M;
        //M -> desired index
        
        while(scan.hasNext())
        {
            values = scan.nextLine().split(" ");
            M = Integer.parseInt(values[values.length - 1]);
            if(M <= values.length - 1)  //M has has to be less than the number of values
            {
                System.out.println(values[values.length-M - 1]);
            }
        }
    }
    }
