

package Stacks;

/*
 * Claiscal problem 
 * asked in many companies
 * 
 */

import java.util.Stack;


// O(N)


public class INTV__Histogram {
    public static void maxArea(int[] arr) {
        int[] nextSmallerLeft = new int[arr.length];
        int[] nextSmallerRight = new int[arr.length];

        Stack<Integer> stack = new Stack<>();
        // Next smaller right
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nextSmallerRight[i] = arr.length;
            } else {
                nextSmallerRight[i] = stack.peek();
            }
            stack.push(i);
        }

        stack = new Stack<>(); // clear previous stack
        // Next smaller left
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nextSmallerLeft[i] = -1;
            } else {
                nextSmallerLeft[i] = stack.peek();
            }
            stack.push(i);
        }

        // Calculate area
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nextSmallerRight[i] - nextSmallerLeft[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("Maximum histogram area is = " + maxArea);
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        maxArea(arr);
    }
}


