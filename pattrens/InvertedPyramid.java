package pattrens;

public class InvertedPyramid  {
    public static void main(String[] args) {
        int b = HalfPyramid.input();
       
        for(int i =1; i<=b;i++){
            for(int j =1; j<=b-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
