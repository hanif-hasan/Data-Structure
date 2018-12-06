/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancedparentheses;

import java.util.Stack;


/**
 *
 * @author HANIF
 */
public class BalancedParentheses {

    /**
     * @param args the command line arguments
     */
    
    public static char [][] TOKENS ={ {'{','}'}, {'(', ')'}, {'[', ']'}};
    
    public boolean isOpenTerm(char c){
        for(char[] array: TOKENS){
            if(array[0] == c)
                return true;
        }
            
        return false;
    }
    
    public boolean matches(char openTerm, char closeTerm){
        for(char[] array: TOKENS){
            if(array[0]== openTerm)
                return array[1]==closeTerm;
        }
        return false;
    }
    
    public  boolean isBalanced(String expression){
        Stack<Character> stack = new Stack<Character>();
        
        for(char c: expression.toCharArray()){
            if(isOpenTerm(c))
                stack.push(c);
            else{
                if( stack.isEmpty() ||!matches(stack.pop(),c))
                    return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        BalancedParentheses balancedParentheses = new BalancedParentheses();
        boolean expression = balancedParentheses.isBalanced("({[})");
        if(expression)
            System.out.println("balanced");
        else
            System.out.println("UNbalanced");
    }
    
    
}
