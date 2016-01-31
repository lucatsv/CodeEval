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
        int number, testCases = -1,doubleSquares;
        double double_num; int int_num;
        while(scan.hasNext())
        {
            doubleSquares = 0;
            if(testCases == -1)
                testCases = scan.nextInt();        
            number = scan.nextInt();
            for(int i =0;i<=Math.sqrt(number);i++)
            {
                double_num = Math.sqrt(number - Math.pow(i, 2));
                int_num = (int)double_num;
                if(double_num - int_num == 0)
                    doubleSquares++;            
            }
            
            System.out.println(doubleSquares == 1 ? doubleSquares : doubleSquares / 2);
            
        }
    }
    
    public static int doubleSquare(int num)
    {
        
        return Integer.MIN_VALUE;
    }
}
