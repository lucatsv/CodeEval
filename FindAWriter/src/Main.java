/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.io.FileInputStream;
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
        FileInputStream file = new FileInputStream(args[0]);
        Scanner scan = new Scanner(file);
        String[] line, authorEncrypted, authorKey;
        StringBuilder authorDecrypted;
        while(scan.hasNext())
        {
            line = scan.nextLine().split("\\|");
            if(line.length != 2)
                continue;
            authorEncrypted = line[0].split("");
            authorKey = line[1].split(" ");
            authorDecrypted = new StringBuilder();
            for(int j=0;j<authorKey.length;j++)
            {
                if(!authorKey[j].equals(" ") && !authorKey[j].equals(""))
                    authorDecrypted.append(authorEncrypted[Integer.parseInt(authorKey[j])-]);
            }
            System.out.println(authorDecrypted);
        }
    }
    
}
