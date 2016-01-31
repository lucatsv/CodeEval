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
import java.io.File;
import java.io.FileNotFoundException;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner scan = new Scanner(file);
        Scanner score;
        String line;
        int[][] table;
        int i,j,col;
        int[] max;
        
        while(scan.hasNext())
        {
            line = scan.nextLine();
            score = new Scanner(line);
            j=0; i=0;
            col = line.split("\\|")[0].split(" ").length;
            table = new int[line.split("\\|").length][col];
            max = new int[col];
            while(score.hasNext())
            {
                line = score.next();
                if(!line.equals("|"))
                {
                    table[i][j] = Integer.parseInt(line);
                }
                else
                {
                    i++;       
                    j=-1;
                }
                j++;
            }
            for(int r=0;r<table.length;r++)
            {
                for(int c=0;c<table[r].length;c++)
                    if(max[c] < table[r][c])
                        max[c] = table[r][c];
            }
            line = "";
            for(int ii=0;ii<max.length;ii++)
            {
                line += max[ii]+ " ";
            }
            System.out.println(line);
            
        }
    }
    
}
