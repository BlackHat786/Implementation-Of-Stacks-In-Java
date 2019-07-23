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
public class StackBusiness {
    Stack<Integer> s= new Stack<Integer>();
    
    public void Reversal(Stack<Integer> stack)
    {
        while(!s.isEmpty())//Check if the stack is not empty.
        {
            stack.pop();//Continue Poping the stack
                        // The purpose of .pop() is to display the last value added.
                        // Hence we continue poping the stack and add it to a new stack so that the first added 4
                        //can be the last added in the new stack
        }
    }    
    
}
