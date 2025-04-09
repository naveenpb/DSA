package Arrays;

public class SubArraySumBrutForce {
    public static void printMaxSubArraysum(int num[]){

        int currsum=0;
        int maxSum = Integer.MIN_VALUE;

        for(int i =0 ;i<num.length;i++){
            for(int j = i ; j<num.length;j++){
                currsum =0;
                for(int k = i; k<=j;k++){
                    System.out.print(num[k]+" ");

                    currsum+=num[k];

                } 
                
                System.out.println();
                    if(maxSum<currsum){
                        maxSum =currsum;
                    }
            }
            System.out.println();
        
        }
        System.out.println();
        System.out.println("The max sum is = " + maxSum);
       
        }

        public static void main(String[] args) {
            
            int num[]={5,3,2,7};
            printMaxSubArraysum(num);
        }
}
