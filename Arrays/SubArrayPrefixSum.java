package Arrays;

public class SubArrayPrefixSum {
    // Time complexity is O(n^2) here 
    // we make a new array where we store the value of prefix sum
    // prefix array from[1 , -2 ,  6,-1,3] is [1 , -1 ,5 ,4 ,7]
    // sum of subArray =prefix[end]-prefix[start-1] 

    // therefore sum = 4-1 =3
    // for caculating prefix array , we have a formula = prefix[i-1](previous sum )+arr[i]
    
    // ///////////PLEASE PASTE THIS CODE TO COPILOT AND ASK FOR EXPLANATION   .......   ITS NOT TRICKY TO UNDERSTAND BUT ITS DIFFRENT FROM PRIVOUS PROBLEM

    
    public static void printMaxSubArraysum(int num[]){

        int currsum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        prefix[0]=num[0];
        // because no sum befor 1st element
        for(int i = 1 ; i<prefix.length;i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i =0 ;i<num.length;i++){
            int start = i ;
            for(int j = i ; j<num.length;j++){
                int end =j;
                currsum= start == 0? prefix[end] :prefix[end]-prefix[start-1];
                    if(maxSum<currsum){
                        maxSum =currsum;
                    }
            }
        
        }
        System.out.println("The max sum is = " + maxSum);
       
        }

        public static void main(String[] args) {
            int n[]={5,3,2,7};;
            printMaxSubArraysum(n);
        }
}
