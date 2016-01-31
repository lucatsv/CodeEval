/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacetest;

/**
 *
 * @author Lucas
 */
public class InterfaceTest  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reversible nm = new Name("lucaS");
        Reversible nb = new Number(123);
        
        System.out.println(InterfaceTest.reverse(nm));
        System.out.println(InterfaceTest.reverse(nb));
        
        
    }
    
    public static Object reverse(Reversible a)
    {
            return a.reverse(a);        
    }
       
}
