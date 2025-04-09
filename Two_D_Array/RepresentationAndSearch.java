
package Two_D_Array;
import java.util.Scanner;

public class RepresentationAndSearch {

    public static void search(int matrix[][] , int key){
        int n =matrix.length; 
        int m = matrix[0].length;
        int found = 0;
        for(int i = 0 ;i<n;i++){
            for(int j =0 ;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.println("YOUR KEY IS FOUND IN " + (i+1) +"th row and in "+ (j+1) +"th column");
                    found = 1;
                }
        
            }
            System.out.println();
        }

        if(found !=1){
            System.out.println(" BC ENTER PROPPER KEY  ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int n =matrix.length; 
        int m = matrix[0].length;
        // we can also diresctly write n=m=3 but we dont need that, we need to learn new and presise method than old traditional method
        // ---------INPUT------------
        System.out.println("Enter the elements ");
        for(int i = 0 ;i<n;i++){
            for(int j =0 ;j<m;j++){

                matrix[i][j]=sc.nextInt();
            }
        }

        // --------------output-------------
        for(int i = 0 ;i<n;i++){
            for(int j =0 ;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5);

        sc.close();
    }
}
