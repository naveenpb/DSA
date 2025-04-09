package Two_D_Array;

public class DiagonalSum {
    public static void diognal(int mat[][]){
        int sum = 0;
        // brutforce approch (general thinking)
        // for(int i =0 ;i<mat.length;i++){
        //     for(int j = 0;j<mat[0].length;j++){
        //         // Primary diognal
        //         if(i == j){
        //             sum += mat[i][j];
        //         }
        //         else if (i+j == mat.length -1){
        //             sum += mat[i][j];
        //         }
        //     }
        // }

        // System.out.println(sum);


        /* 
        
        
        The above commented code is brutfore approch and its not an optimal solution as we can also do it in linear time complexity also
         * 
         * 
         * 
         */

        //  the optimal code is here

        for(int i = 0 ;i<mat.length;i++){
                // primary diognal
                sum += mat[i][i];
                // secondary diognal
                // but we have another condition here where we have to avoid overlapping so in ssecondary diognaal when i = j we can skip so
                if(i != mat.length-i-1)
                    sum +=mat[i][mat.length-1-i];

            }
            System.out.println(sum);
        }

    

    public static void main(String[] args) {
        
    int matrix[][] ={{1,2,3,4},
    {5,6,7,8},
    {9,10,11,12},
    {13,14,15,16}};

    diognal(matrix);

    }
}
