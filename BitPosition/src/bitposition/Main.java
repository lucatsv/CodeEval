/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitposition;


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
        Scanner scanBin;
        //String line[],n;
        String line, n;
        int p1,p2;
        while(scan.hasNext())
        {
            line = scan.next();
            scanBin = new Scanner(line);
            scanBin.useDelimiter(",");
            n = Integer.toBinaryString(Integer.parseInt(scanBin.next()));
            p1 = Integer.parseInt(scanBin.next()) - 1;
            p2 = Integer.parseInt(scanBin.next()) - 1;
            System.out.println(n.charAt(p1) == n.charAt(p2));
        }
        scan.close();
        System.exit(0);
    }
}
