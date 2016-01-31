/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestlines;


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
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner scan = new Scanner(file);
        String line;
        int n=-1;
        String[] str = null;
        String aux;
        int index=0,k=0;
        while(scan.hasNext())
        {
            line = scan.nextLine();
            if(n == -1)
            {
                n = Integer.parseInt(line);
                str = new String[n];
                for(int i=0;i<n;i++)
                    str[i] = "";
            }
            else
            {
                index = getMin(str);
                if(str[index].length() < line.length())
                {
                    str[index] = line;
                }
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(str[i].length() > str[j].length())
                {
                    aux = str[i];
                    str[i] = str[j];
                    str[j] = aux;
                }            
            }
        
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.println(str[i]);
        }
        
        
     }   
    
    
    public static int getMin(String[] str)
    {
        int minIndex = 0;
        for(int i=0;i<str.length;i++)
        {
            if(str[i].length() < str[minIndex].length())
            {
                minIndex = i;
            }
        }
        return minIndex;
    }
}