/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

/**
 *
 * @author Lucas
 */
public class LightsOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CircuitBoard cb = new CircuitBoard("5 7 .O.O...|..O.O..|.O.O..O|.O..OOO|OO.OOOO");        
        
        for(short m = 0;m<cb.getCBoard().length;m++)
        {
            for(short n=0;n<cb.getCBoard()[m].length;n++)
            {
                System.out.println(cb.getCBoard()[m][n]);
            
            }
        }
        
    }
    
}
