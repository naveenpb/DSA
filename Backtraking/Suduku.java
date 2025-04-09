package Backtraking;

/*
 * 
 * 
 * ALL THESE PROBLEMS ARE IMPORTANT  UT IM SOLVING THESE PROIBLEMS IN BRUTW FORE APPROCK ,BUT BY USING HASSET WE CAN OPTIMIZE IT MORE
 * 
 * 
 * 
 */

public class Suduku {

    public static boolean issafe(int suduko[][] , int row , int col,int digit){
        // column
        for(int i =0; i<=8;i++){
            if(suduko[i][col] == digit){
                return false;
            }
        }

        // row
        for(int j =0 ;j<9;j++){
            if(suduko[row][j] == digit){
                return false;
            }
        }

        //grid
        int sr =(row/3)*3;
        int sc =(col/3)*3;

        for(int i =sr ;i<sr+3;i++){
            for(int j = sc ; j<sc+3 ;j++){
                if(suduko[i][j] == digit){
                    return false;
                }
            }
        }

        return true;

           



    }
    public static boolean sudukosolver(int suduko[][] , int row , int col){
        //base case
        if(row == 9 ){
            return true;
        }
        else if(row ==9){
            return false;
        }
        //recurssion
        int nextrow = row ;
        int nextcol = col+1;

        if(col+1 == 9 ){
            nextrow+=1;
            nextcol=0;
        }
        if(suduko[row][col]!=0){
           return sudukosolver(suduko, nextrow, nextcol);
        }
        for(int digit =1 ;digit<=9;digit++){
            if(issafe(suduko,row,col,digit)){
                suduko[row][col] = digit;
                if(sudukosolver(suduko,nextrow,nextcol)){
                    return true;
                };
                suduko[row][col] = 0;
            }
        }
        return false;
    }

    public static void printsuduko(int suduko[][]){
        for(int i =0 ;i<9;i++){
            for(int j =0;j<9;j++){
                System.out.print(suduko[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int suduku[][]= {{0,0,8,0,0,0,0,0,0} ,
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}};

        if(sudukosolver(suduku, 0, 0)){
            System.out.println("Solution Exists");
        }
        else{
            System.out.println("Solution doesent exists");
        }
        printsuduko(suduku);

   
    }
}
