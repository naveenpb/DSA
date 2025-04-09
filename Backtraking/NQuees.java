package Backtraking;

public class NQuees {
    /*
     * hey this is not n- queens code man , here no attacking logic has been written , only thing erittrn is , how to sit n queeens in n rows
     * infurther i have down trhis code complete 
     * We also have N-knights problem to do , so we have to slove that problem with the same approch but knight move in L direction.
     */

    static int  a = 0 ;
    public static void nQueensRow(char board[][] , int row){
        
        
        // base case
        if(row == board.length){
                a++;
                printboard(board);
                return; //important in b ase case retrun statement.
        }
        
        // recurssion (column loop)
       
        for(int j = 0 ; j<board.length;j++){
            if(issafe(board, row, j) == true){
            board[row][j] = 'Q';
            nQueensRow(board, row+1); //recurssion call , if you didnt understand then do the stack analysis , in that the current call will be deletetd abd the 9next  one will be doen 
            board[row][j] ='X';
        }
        
    }

   
    
    }



    public static void printboard(char board[][]){
        System.out.println("-------Chess-Board -------------");
        for(int i=0 ; i<board.length ;i++){
            for(int j =0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static boolean issafe(char board[][] , int row , int col){
        
        //vertical up 
        for(int i = row-1 ; i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //diognal leftup
        for(int i = row-1 ,j =col-1; i>=0&&j>=0 ; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //dioganal right up 
        for(int i = row-1 ,j =col+1; i>=0&&j<board.length ; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int n =5;
        char board[][] = new char[n][n];
        // initialize
        for(int i =0 ; i<n ;i++){
            for(int j= 0 ;j<n ;j++){
                board[i][j] = 'X';
            }
        }
        nQueensRow(board , 0);
        if(a>0){
            System.out.println("YES THE SOLUTION EXSISTS");
        }
        if(a==0){
            System.out.println("BHAI THERE IS NO SOLUTION");
        }
        System.out.println("The number of solutions are " + a);
    }
}
