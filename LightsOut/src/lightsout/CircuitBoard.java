/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

import java.util.Scanner;
import exceptions.InvalidEntryException;
/**
 *
 * @author Lucas
 */
public class CircuitBoard {
    
    private boolean[][] cBoard;
    
    public CircuitBoard(String cbSettings)
    {
        this(Short.parseShort(cbSettings.split(" ")[0]),Short.parseShort(cbSettings.split(" ")[1]));
        this.setCBoard(cbSettings.split(" ")[2]);
    }
    
    public CircuitBoard(short M, short N){
        cBoard = new boolean[M][N];
    }
    
    public void setCBoard(String value) {
        Scanner scan = new Scanner(value); 
        scan.useDelimiter("");
        String val = "";
        short m = 0, n = 0;
        while(scan.hasNext())
        { 
            val = scan.next();
            if(val.equals("|"))
            {
            } else {
                cBoard[m][n] = this.turnOnOff(val);
                n++;
                if(n == cBoard[m].length)
                {
                    m++;
                    n=0;
                }
            }
        }
    }
    
    public boolean[][] getCBoard(){
        return cBoard;
    }
    
    private boolean turnOnOff(String value) {
        return "O".equals(value);
    }
}
