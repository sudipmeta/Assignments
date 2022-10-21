package recursion;


public class NQueens{
    /**
     * To check whether queen is safe or not.
     * @param board 2d-array representing the boards on which the queens are placed upon
     * @param integer row representing the row where the queen is going to be placed if safe
     * @param integer col representing the column where the queen is going to be placed if safe
     * @return true if safe else false
     */
    static boolean checksafe(int board[][], int row, int col) {     
            for (int i = 0; i < col; i++)
                if (board[row][i] == 1)//horizontal
                    return false;
            
            for (int i = 0; i < row; i++)//vertical
                if (board[i][col] == 1)
                    return false;
          //upper left
            int j=row;
            int k=col; 
            while(j >= 0 && k >= 0 ) {
                if(board[j][k] == 1)
                    return false;
                j--;
                k--;
            }
            //upper right
            j=row;
            k=col;            
            while(j >= 0 && k < board.length ) {
                if(board[j][k] == 1)
                    return false;
                j--;
                k++;
            }
            // down left
            j = row;
            for(int c=col; c>=0 && j<board.length; j++, c--) {
                if(board[j][c] == 1) {
                    return false;
                }

            }
            //lower right
            for(int c=col; c<board.length && j<board.length; c++, j++) {
                if(board[j][c] == 'Q') {
                    return false;
                }
            }

            
            return true;
        }
    
    /**
     * For placing N chess queens on an N×N chess board so that no two queens attack each other.
     * @param board 2d-array representing the boards the queens are placed upon
     * @param integer startRow representing the row where the placing is going to begin from
     * @param integer dimensionOfMatrix representing the dimension of the square matrix
     * @return true if all queens are placed safely else false.
     */
    static boolean  nQueen(int[][] board, int startRow, int dimensionOfMatrix) {
        if(startRow >= dimensionOfMatrix) 
            return true;

                
        for(int i=0; i < dimensionOfMatrix; i++) {
            if(checksafe(board, startRow, i)) {
                board[startRow][i] = 1;
                
                if(nQueen(board, startRow+1, dimensionOfMatrix)) {
                    return true;
                }
                board[startRow][i]=0;
            }
        }
        return false;
    }   
 
        public static void main(String[] args) {
            int[][] arr    = {{0,0,0,0},
                           {0,0,0,0},
                           {0,0,0,0},
                           {0,0,0,0}};
            System.out.println(nQueen(arr,0,4));
            for(int i=0; i < 4; i++) {
                for(int j=0; j < 4; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
   

