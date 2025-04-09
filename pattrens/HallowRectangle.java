package pattrens;

public class HallowRectangle {
    // imagine it as matrix
    // now to do hallow matrix we have to print the * where-ever the value of row =1 and column =1, and print * value in last row and column.
    // eg :- we have 4 row and 5 columns , so we have to print the * value in row 1 , column 1 and row 4 and column 5
    // bounndry condition :- (row=1||col=1||row=4||col=5) sout * 
    
    public static void hallow_rectangle(int rows , int cols){
        //outer loop
        for(int i =1 ; i<=rows;i++){
            // inner loop
            for(int j =1 ; j<=cols;j++){
                // logical condition
                if(i==1||j==1||i==rows||j==cols){
                    System.out.print("*");
                }
                else{
                    //givingn space is imppp , not only double quotes
                    System.out.print(" ");
                }
        
            }
        System.out.println();
        }

    }

    public static void main(String[] args) {
        hallow_rectangle(4,5);
    }
}
