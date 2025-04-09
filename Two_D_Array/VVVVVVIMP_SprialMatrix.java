package Two_D_Array;
/*
 * 
 * 
 * 
 * WHERE EVER I HAVE WRITTEN VVVVVIMP IN FRONT OF MY CLASS NAME , ITS AN IMPORTANT TOPIC , OR A QUESTION ASKED IN MOST OF THE INTERVIEWS.
 *   
 * 
 * 
 */
public class VVVVVVIMP_SprialMatrix {
    public static void sprial(int mat[][]){
    int  startcol =0;
    int startrow =0;
    int endcol = mat.length-1;
    int endrow =mat[0].length-1;
     while(startrow <= endrow && startcol <=endcol ){
            // print top
            // we have to print top
            //  im using j to print columns and i to print rows
            for(int j = startcol;j<=endcol;j++){
                System.out.print(mat[startrow][j]+" ");
            }
            // right row
            for(int i = startrow +1 ;i<=endrow ;i++){
                System.out.print(mat[i][endcol] +" ");
            }
            // bottom
            for(int j= endcol-1 ;j >=startcol;j--){
                if(startrow == endrow){
                    break; 
                    // this is because when the we have only one row in matrix.
                }
                System.out.print(mat[endrow][j]+" ");
            }
            //left row
            for(int i = endrow-1 ;i > startrow ;i--){
                if(startcol == endcol){
                    break;
                    // this is because when the we have only one col in matrix.
                }
                System.out.print(mat[i][startcol]+" ");
            }

            startcol ++ ;
            startrow ++;
            endcol --;
            endrow -- ;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] ={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        sprial(matrix);
    }
}
