package patterns;
import java.util.Scanner;

public class Halftraingale {

    public static Scanner sc = new Scanner(System.in);

    public static int takeinput() {
        System.out.println("Enter the number:");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int n = takeinput();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
