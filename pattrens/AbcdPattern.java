package pattrens;

public class AbcdPattern {
    public static void main(String[] args) {
        char ch ='A';
        int n = HalfPyramid.input();
        for(int i =1; i<=n;i++){
            for(int j =1 ; j<=i;j++){
                System.out.print(ch);
                ch++;

                if(ch =='['){
                    ch=  'A';
                }
            }
            System.out.println();
        }
    }
}
