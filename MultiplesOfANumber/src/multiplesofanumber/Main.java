/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplesofanumber;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Lucas
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner scan = new Scanner((file));
        int x, m;
        short n;
        String line;
        while(scan.hasNextLine())
        {
            m=0;
            line = scan.nextLine();
            x = Integer.parseInt(line.split(",")[0]);
            n = Short.parseShort(line.split(",")[1]);
            
            while(m<=x)
            {
                m+=n;
            }
            System.out.println(m);
        }
        scan.close();
    }
}
