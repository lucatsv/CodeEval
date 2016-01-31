/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofprimes;

/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        int sum = 0, count = 0, i = 0;        
        while(count <= 1000)
        {
            if(isPrime(i))
            {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
        System.exit(0);
    }
    
    
    public static boolean isPrime(int num){
        int div = 2;        
        if(num == 1)
            return false;
        while (div < num)
        {
            if(num % div == 0 && div < num)
                return false;
            div++;
        }
        return true;
    }    
}
