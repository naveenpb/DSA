package Stacks;
import java.util.Stack;


public class INTV__PushAtBottom {
    // ASKED AT AMAZON
    /*
     * 
     * 
     * USNIG REUCRSSION LOT OF STACK QUESTIONS WILL BE SLOVED
     * 
     * 
     * 
     */

     


     public static void pushatbottom(Stack<Integer> s, int data ){
        if(s.isEmpty()){
            s.push(data);
            return; //VIMP TO WRITE THIS ELEMENT
        }
        
        int top = s.pop();
        pushatbottom(s, data);
        s.push(top); //recursssion stack inda vapas stack ge hakake

        // so here s.psuh(top) , is the statement which is executing while returing of  recurssive calls ,, when call stack of recurssion is returning ..the elememnt which were added to recurssive stack will be put again to our stack..
     }
      public static void main(String[] args) {
        Stack <Integer> s  = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushatbottom(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

        
        

      }
}
