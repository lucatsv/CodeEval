/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 *
 * @author Lucas
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner scan = new Scanner(file);
        int stringSize;
        String line;
        char c;
        Scanner scanValues;
        ArrayList<Character> characters = new ArrayList();
        while(scan.hasNext())
        {
            line = scan.nextLine();
            scanValues = new Scanner(line);
            scanValues.useDelimiter(",");
            while(scanValues.hasNext())
            {
                stringSize = scanValues.nextInt();
                line = scanValues.next();
                for(int i=0;i<line.length();i++)
                {
                    c = line.charAt(i);
                    if(!characters.contains(c))
                        characters.add(c);
                }
                
                for(int j=0;j<characters.size();j++)
                {
                    line = "";
                    for(int i=j;i<stringSize;i++)
                    {
                        line += Character.toString(characters.get(i));
                    }
                    System.out.println(line);
                }
                characters.clear();
                
            }
        }
    }
    
}
