package Stacks;
import java.util.Stack;

public class INTV__NextGreatestInteger {
    /*
     * 
     * CLASICALL PROBLEM.
     * LOGIC IS VIMPORTANT , MANY PROBLEM CAN BE SOLVED USING THIS LOGIC..........
     * 
     * USING BRUTEFORCE , BY USING TWO FOR LOOPS SOLVING IT IS VERY EASY BUT TOO MAKE IT MUCH OPTIMISED TO SOLVE IN O(N) WE NEED THIS APPROCH
     */

     public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGreatestInterger[] = new int[arr.length];
        
        // Start from last position of array
        
        for(int i = arr.length-1 ; i >= 0 ; i--){
            // while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i] ){
                s.pop();
            }
            // andre last position ge next greatest integer yavvudu illa , so -1 hogutte
            if(s.isEmpty()){
                nextGreatestInterger[i] = -1;
            }

            else{
                nextGreatestInterger[i] = arr[s.peek()];
            }

            s.push(i);
            
        }

        for(int i = 0 ; i < nextGreatestInterger.length ; i ++){
            System.out.print(nextGreatestInterger[i] + ",");
        }
     }
}
