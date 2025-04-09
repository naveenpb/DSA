package pattrens;

public class InvertedHalfPyramidNumbers {
    public static void invetedHalfNum(int n){
        //outer loop
        for(int i =1 ; i<=n ;i++){
            //logic for numbers
            for(int j =1; j<=n-i+1;j++){
                // if we only put n-i 1st line wouldnt be printed
                System.out.print(j+" ");
            }
            System.out.println();
        }    
    }

    public static void main(String[] args) {
        invetedHalfNum(8);
    }
}
