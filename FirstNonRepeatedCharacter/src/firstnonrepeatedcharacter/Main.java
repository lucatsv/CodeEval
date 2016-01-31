/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstnonrepeatedcharacter;

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
        String line;
        char letter;
        Scanner scanWord;
        char[] counterUpper = new char[26];
        char[] counterLower = new char[26];
        for(int i=0;i<26;i++)
        {
            counterUpper[i]=0;
            counterLower[i]=0;        
        }
        
        while(scan.hasNext())
        {
            line = scan.next();
            scanWord = new Scanner(line);
            scanWord.useDelimiter("");

        for(int i=0;i<26;i++)
        {
            counterUpper[i]=0;
            counterLower[i]=0;        
        }    

            while(scanWord.hasNext())
            {
                letter = scanWord.next().charAt(0);
                if(letter >= 65 && letter <= 90)
                {
                    counterUpper[letter-65] += 1;
                }
                else if(letter >= 97 && letter <= 122)
                {
                    counterLower[letter-97] += 1;
                }
            }
            
            for(int i=0;i<line.length();i++)
            {
                letter = line.charAt(i);
                if(letter >= 65 && letter <= 90)
                {
                    
                    if(counterUpper[letter-65] == 1)
                    {
                        System.out.println(letter);
                        break;
                    }
                    
                }
                else if(letter >= 97 && letter <= 122)
                {
                    if(counterLower[letter-97] == 1)
                    {
                        System.out.println(letter);
                        break;
                    }
                }
            }
        }
    }
}
