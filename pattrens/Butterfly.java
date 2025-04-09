package pattrens;

public class Butterfly {
    public static void printButterfly(int n ){
        //1st half
        for(int i =1 ;i<=n;i++){
            // starts -i
            for(int j=1 ;j<=i;j++){
                System.out.print("*");
            }
            // space = 2*n-i
            for(int j =1 ; j<=(2*(n-i));j++){
                System.out.print(" ");
            }
           
            // starts-i
            for(int j=1 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        // just reverse the outer loop and all the things will be same
        for(int i = n; i>=1;i--){
            for(int j=1 ;j<=i;j++){
                System.out.print("*");
            }
            // space = 2*n-i
            for(int j =1 ; j<=(2*(n-i));j++){
                System.out.print(" ");
            }
           
            // starts-i
            for(int j=1 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printButterfly(10);
    }
}
