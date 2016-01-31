/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz.util;

/**
 *
 * @author Lucas
 */
public final class WriteOutput {
    
    
    public static String output(int multiple_a, int multiple_b, int limit)
    {
        String output = "";
        for(int i=1;i<=limit;i++)
        {
            if(i % multiple_a == 0 && i % multiple_b == 0)
                output +=  " FB";
            else
                if(i % multiple_a == 0)
                    output +=  " F";
                else if(i % multiple_b == 0)    
                    output +=  " B";
                else
                    output +=  " " + i;
        }
        return output;
    }
    
}
