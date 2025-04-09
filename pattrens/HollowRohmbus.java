package pattrens;

public class HollowRohmbus {
   public static void printHallow(int n ){
    for(int i =1 ; i<=n;i++){
        // to provide spaces
        for(int j =1 ; j<=n-i;j++){
            System.out.print(" ");
        }
        // after giving space just write hallow rectagle code.
        for(int j =1; j<=n;j++){
            if( i ==1 || i == n || j ==1 || j== n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
   }

   public static void main(String[] args) {
    printHallow(5);
   }
    
}