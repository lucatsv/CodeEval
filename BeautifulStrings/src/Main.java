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

    
    public static char[] alphabet = new char[26];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file = new File(args[0]);
        Scanner scan = new Scanner(file);
        Scanner scanLetter;
        String line;
        int beauty, points;
        char a;
        while(scan.hasNext())
        {
            beauty = 0; points = 26;
            line = scan.nextLine().toUpperCase();
            scanLetter = new Scanner(line);
            scanLetter.useDelimiter("");
            setAlphabet();
            while(scanLetter.hasNext())
            {
                a = scanLetter.next().charAt(0);
                if(a >= 65 && a <= 90)
                    alphabet[a - 65]++;
            }           
            orderAlphabet();
            for(int i=0;i<26;i++)
            {
                beauty += (int)alphabet[i] * points;
                points--;
            }
            System.out.println(beauty);
        }
    }
    
    public static void setAlphabet(){
        for(int i=0;i<26;i++)
            alphabet[i] = 0;
    }
    
    public static void orderAlphabet(){
        char aux;
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<26;j++)
            {
                if(alphabet[i] > alphabet[j])
                {
                    aux = alphabet[i];
                    alphabet[i] = alphabet[j];
                    alphabet[j] = aux;
                }
            }
            
        }
    }
    
}
