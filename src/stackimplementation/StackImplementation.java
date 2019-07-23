/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackimplementation;
import java.util.*;
/**
 *
 * @author Mo'Ameen
 */
public class StackImplementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Stack<Integer> s= new Stack<Integer>();
        StackBusiness stack= new StackBusiness();      
        
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(0);
        
       System.out.println("Display The Stack");
       System.out.println(s);   
         
        System.out.println("=== === === === === ===");
        System.out.println("Display The In Reverse Stack");
        Stack<Integer> backup= new Stack<Integer>();
        //A new Stack is created to save the values being removed from the first stack.
        while(!s.isEmpty())
        {
            int x= s.pop();// a temp variable is created to save the next value being removed.
            backup.push(x);// the next value stored in the temp variable is added to the new stack created          
        }      
               
         
         stack.Reversal(backup);        
         System.out.println(backup); 
         
         System.out.println("=== === === === === ===");
         System.out.println("Display The Max Value In The Stack");
         int max=0;// a temp variable is created to store the first value being removed from the stack
         if(!backup.isEmpty())
         {
             max= backup.pop();
             s.push(max);// this is done so that the value isn't lost.
             while(!backup.isEmpty())//run a while loop to check each value being removed and saved which is compared to the initial value
             {
                 int next= backup.pop();
                 s.push(next);
                 max= Math.max(max, next);//Function Math.max(); is used to compare the values
             }
             
            System.out.println("The max Value is:   "+max);
         } 
          
         System.out.println("=== === === === === ===");
         System.out.println("Display The Min Value In The Stack");
          if(!s.isEmpty())//Similar the how the max value was found.
         {
             int min= s.pop();
             while(!s.isEmpty())
             {
                 int next= s.pop();
                 min= Math.min(min, next);
             }
            System.out.println("The Min Value is:"+min);
         }   
         
    }
   
}
