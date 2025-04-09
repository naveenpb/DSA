package pattrens;

public class InvertedHalfPyramidMirror {
   
    public void invertedhalf(int n ){
        
        for(int i =1 ; i<=n ;i++){
            // logic for printing space
            for(int j = 1 ;j<=n-i;j++){
                System.out.print(" ");
            }
            //logic to print stars
            for(int j =1 ; j<=i; j++){
                System.out.print("*");
            }


            System.out.println();
        }

    }

    public static void main(String[] args) {
        InvertedHalfPyramidMirror obj = new InvertedHalfPyramidMirror();
        obj.invertedhalf(5);
    }
}
