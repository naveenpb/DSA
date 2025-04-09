package pattrens;

public class FloydsTriangle {
    int cnt = 1;
    public  void printfloys(int n ){
        for(int i =1 ;i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(cnt);
                cnt++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FloydsTriangle obj = new FloydsTriangle();
        obj.printfloys(7);
       
    }
}
