package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NQueensTest {

    @Test
    void nQueenTest() {        
        int[][] arr    = {{0,0,0,0},
                       {0,0,0,0},
                       {0,0,0,0},
                       {0,0,0,0}};
        
        boolean output = NQueens.nQueen(arr,0,4);
        
        assertEquals(true,output); 
    }

}
