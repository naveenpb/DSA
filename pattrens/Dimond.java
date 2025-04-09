package pattrens;

public class Dimond {
    public static void printdimond(int n ){
        // 1st half
        for (int i = 1; i<=n;i++){
            // print spaces
            for(int j = 1; j <=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1; j<=((i*i)-((i-1)*(i-1)));j++){
                System.out.print("*");
            }
            // simple logic is given belo
            System.out.println();
        }

        // 2nd half

        for(int i = n ; i>=1;i--){
                // print spaces
                for(int j = 1; j <=n-i;j++){
                    System.out.print(" ");
                }
                // for(int j =1; j<=((i*i)-((i-1)*(i-1)));j++){
                //     System.out.print("*");
                // }
                // apart of that big logic i have one small logic
                for(int j =1; j<=(2*i)-1;j++){
                        System.out.print("*");
                    }
                
                System.out.println();
        }

    }

    public static void main(String[] args) {
        printdimond(10);
    }
}
