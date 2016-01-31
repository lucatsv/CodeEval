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
public class Number implements Reversible<Number>{

    private static int x;
    
    public Number(int x)
    {
        this.setX(x);
    }
    
    public int getX()        
    {
        return x;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }

    
    public Number reverse(Number input) {
        this.setX(Integer.reverse(input.getX()));
        return input;

    }

    public String toString(){
        Integer i = this.getX();
        
        return i.toString();
    }
    
}
