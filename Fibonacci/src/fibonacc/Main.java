package fibonacc;
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
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        File file = new File(args[0]);
        Scanner scan = new Scanner(file);
        int n;
        while(scan.hasNext())
        {
            n = scan.nextInt();
            System.out.println(fibo(n));
        }
        scan.close();
        System.exit(0);
    }
    
    
    public static int fibo(int n)
    {
        int[] f = new int[n+2];
        
        f[0] = 0;
        f[1] = 1;
        for(int i=2; i<=n;i++)
            f[i] = f[i-1] + f[i-2];
        return f[n];
    }
    
}
