package Two_D_Array;

public class SearchMatrix {

    public static boolean staircasesearch(int mat[][],int key){
        int row =0 ,col =mat[0].length-1;
        while(row < mat.length && col >=0){
            if(mat[row][col]==key){
                System.out.print("found key at " +row + col);
                return true;
            }

            else if(key < mat[row][col]){
                col --;
            }

            else{
                row ++;
            }
        }
        System.out.println("KEY NOT FOUND");
        return false;
    }


    public static void main(String[] args) {
        int mat[][]={{10, 20,30,40},
                        {15,25,35,35},
                        {27,29,37,48},
                        {32,33,39,50}};
    
    int key  = 33;
    staircasesearch(mat, key);
                    
}
}
