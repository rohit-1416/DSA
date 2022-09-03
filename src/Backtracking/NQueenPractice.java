package Backtracking;

public class NQueenPractice {
    final int N =  4;
    public boolean isSafe(int board[][], int row , int col){
        for ( int i = 0 ; i<col ; i++){
            if (board[row][i] == 1)
                return false;

            if( board [i][col] == 1 )
                return false;
        }
        for(int i = row, j= col; i>= 0 && j>= 0 ; i-- , j--){
            if(board[i][j] == 1)
                return false;
        }
        for (int  i = row , j =col ; i< N && j >= 0 ; i++ ,j--){
            if(board [i][j] == 1)
                return false;
        }
        return true;
    }
    public boolean Solve(int board[] [] , int col){
        if (col >= N)
            return true;
        for (int row =0 ; row < N ;row++){
            if(isSafe(board,row,col)){
                board[row][col] =1 ;
                if(Solve(board,col+1))
                    return true;
            }
            board[row][col] = 0 ;
        }
        return false;
    }
    public void Print(int board [][]){
        for (int i =0 ; i< N ; i++){
            for (int j = 0 ; j< N ; j++){
                System.out.print(" "+ board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public boolean DriverCode(){
        int board [] [] ={{0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };
        if (  Solve(board, 0) == false){
            System.out.println("Solution doesn't Exist");
            return false;
        }
            Print(board);
            return true;

    }
    public static void main(String[] args) {
        NQueenPractice nq = new NQueenPractice();
        nq.DriverCode();
    }
}
