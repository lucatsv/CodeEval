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
public class Name implements Reversible<Name> {
    private String name;
    
    public Name(String name)
    {
        this.name = name;
    }
    
    public  String getName(){
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Name reverse(Name input){
        String output = "";
        for(int i= input.getName().length() - 1;i>=0;i--)
        {
            output = output + input.name.charAt(i);
        }
        
         input.setName(output);
        return input;
    }

    public String toString()
    {
        return this.getName();
    }
    
}
