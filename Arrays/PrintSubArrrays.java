package Arrays;

public class PrintSubArrrays {
    public static void printsub(int num[]){
        int k ;
        int n = num.length;
        int subsum = 0;
        int index =0;
        int totalpairs = (n*(n+1))/2;
        int indsum[] = new int[totalpairs] ;
        int total=0;// to avoid time complexity we have a formula ie n(n+2)/2, so lets us try that.
        for(int i =0 ;i<num.length;i++){
            for(int j = i ; j<num.length;j++){
                for(k = i; k<=j;k++){
                    System.out.print(num[k]+ " ");
                    // now the given task is to make sum of all the sub arrays and , give the output that which is the largtest and and smallest value
                   
                    subsum +=num[k];
                    indsum[index]=subsum;
                    }
                index ++;
                subsum = 0 ;
                total ++;
                System.out.println();
            }
            System.out.println();
        }
        for(int i = 0; i<indsum.length;i++)
        {
            System.out.print(indsum[i] + " ");
        }
        System.out.println();
        System.out.println("The total number of sub arrays are = "+ total );
        System.out.println("The total number of sub arrays caculated by formula are =" + totalpairs);
        findmaxmin(indsum);

        // the solution i have written here is not an optimal solution because of the time complexity of O(n^3), even with the space complexity , so to avoid this we have to do the 
        // brut fore method .
        }

    public static void findmaxmin(int n[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i<n.length;i++){
            if (n[i]>max) {
                max = n[i];
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n.length;i++){
            if (n[i]<min) {
                min = n[i];
            }
        }
        System.out.println("The max value is " + max);
        System.out.println("The Min value is "+ min);

    }

    public static void main(String[] args) {
        int num[]={5,3,2,7};
        System.out.println("hiiiii"+num.length);
        printsub(num);
    }
}
