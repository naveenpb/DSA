package pattrens;

public class SolidRohmbus {
    public static void printrhombus(int n ){
        for(int i = 1 ; i<=n ; i++){
            // print space first
            for(int j =  1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printrhombus(8);
    }
}
