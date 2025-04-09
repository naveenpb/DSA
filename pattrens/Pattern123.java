package pattrens;

public class Pattern123 {
    public static void main(String[] args) {
        int n = HalfPyramid.input();
        for(int i =1; i<=n;i++){
            for(int j =1 ; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    

}
