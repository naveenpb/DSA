package Stacks;

import java.util.Stack;

public class INTV__ReverseString {
    // just remove it and add uit to a string --> bruteforce
    
    
    public static String reversestring(String a){
        
        Stack<Character> stack= new Stack<>();
        StringBuffer reversestring = new StringBuffer(); //can also use string builder
        int inx = 0 ;
        while (inx < a.length() ) {
            stack.push(a.charAt(inx));
            inx++;
        }

        while(!stack.isEmpty()){
            reversestring.append(stack.pop());
        }
        return reversestring.toString();
    }
    public static void main(String[] args) {

        String origional = "dcba";
        System.out.println(reversestring(origional));
        
    }
}
