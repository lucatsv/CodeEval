/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream file = new FileInputStream(args[0]);
        Scanner scan = new Scanner(file);
        String data[], products[], customer;
        DecimalFormat fmt = new DecimalFormat("0.00");
        float MaxIndex;
        float SSindex, SSindex_max;
        Scanner scanCustomer;
        while(scan.hasNext())
        {   
            data = scan.nextLine().split(";");
            if(data.length == 2){
                
                scanCustomer = new Scanner(data[0]);
                scanCustomer.useDelimiter(",");
                //customers = data[0].split(",");
                products = data[1].split(",");
                MaxIndex = 0;
                while(scanCustomer.hasNext())
                {
                    customer = scanCustomer.next();
                    SSindex_max = -1;
                    for(byte i=0;i<products.length;i++)
                    {
                        SSindex = numberOfLetters(products[i]) % 2 == 0 ? numberOfVowels(customer) * 1.5f : numberOfLetters(customer) - numberOfVowels(customer);
                        if(commonFactors(numberOfLetters(customer),numberOfLetters(products[i]))) 
                            SSindex = SSindex * 1.5f;
                        
                        if(SSindex_max < SSindex)
                            SSindex_max = SSindex;                     
                    
                    }
                    MaxIndex += SSindex_max;
                }
                System.out.println(fmt.format(MaxIndex));    
            }
        }
    }
    
    public static byte numberOfVowels(String customer)
    {
        byte numberOfVowels = 0;
        for(char c : customer.toCharArray())
            if(c == 65 || c == 97 || c == 69 || c == 101 || c == 73 || c == 105 || c == 79 || c == 111 || c == 85 || c == 117 || c == 89 || c == 121)
                numberOfVowels++;

        return numberOfVowels;
    }
    
    public static boolean commonFactors(byte a, byte b)
    {
        if(a % 2 == 0 && b % 2 == 0)
            return true;
        else if(a % 3 == 0 && b % 3 == 0)
            return true;
        else if(a % 5 == 0 && b % 5 == 0)
            return true;        
        else if(a % 7 == 0 && b % 7 == 0)
            return true;        
        else if(a % 9 == 0 && b % 9 == 0)
            return true;
        else if(a % 11 == 0 && b % 11 == 0)
            return true;     
        else if(a % 12 == 0 && b % 12 == 0)
            return true;        
        else if(a % 13 == 0 && b % 13 == 0)
            return true;        
        else
            return false;
    }
    
    public static byte numberOfLetters(String name)
    {
        byte count = 0;        
        for(char c : name.toCharArray())
            if(c >= 65 && c <= 90 || c >= 97 && c <= 122)
                count++;
        return count;
    }
    

}
