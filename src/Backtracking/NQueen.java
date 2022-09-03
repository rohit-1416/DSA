package Backtracking;

public class NQueen {
    final int N= 4 ;

//    utility function to print
    public void print ( int board [][]){
        for (int i= 0 ; i< N ; i++){
            for (int j = 0 ; j < N ; j++){
                System.out.print(" "+board[i][j] +" ");
            }
            System.out.println();
        }
    }

    public boolean isSafe(int board[] [] , int row , int col ){
        /*  _________________
           i |   |   |   |   |
            -----------------
           i |   |   | # |   |       let i = 2 and row = 1
            -----------------
           i | # |   |   |   |       let i  = 0 and row = 2
            -----------------
           i |   |   |   |   |
            -----------------
                j   j   j   j
         */
//        check row
        for (int i =0 ;i< col ;i++){
            if( board[row][i] == 1 )
                return false;
//        check col
            if( board [i][col] == 1)
                return false;
        }
//        check upper left diagonal
        for (int i = row , j =col ; i >=0 && j>= 0; i--,j--){
            if(board[i][j] == 1)
                return false;
        }
//        check  lower left diagonal
        for (int i = row, j= col ; i < N && j >=0 ; i++, j-- )
            if (board[i][j] ==1)
                return false;

        return true;
    }
    /* A recursive utility function to solve N
       Queen problem */
    public boolean Solve (int board[] [] , int col){
//        if all queens are placed
        if (col >= N)
            return true;

        for (int row = 0 ; row< N ; row++){
            /* Check if the queen can be placed on
               board[i][col] */
                if(isSafe(board, row , col)) {
                    /* Place this queen in board[i][col] */
                    board[row][col] = 1;
//                    recurse the function
                    if(Solve(board,col+1)){
                        return true;
                    }
                }
                /* If placing queen in board[i][col]
                   doesn't lead to a solution then
                   remove queen from board[i][col] */
                board[row][col]=0; //backtrack
        }
        return false;
    }

    boolean solveNQ()
    {
        int board[][] = { { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 } };

        if (Solve(board, 0) == false) {
            System.out.print("Solution does not exist");
            return false;
        }

        print(board);
        return true;
    }

    public static void main(String[] args) {
        NQueen Queen = new NQueen();
        Queen.solveNQ();
    }
}
