package sparsematrix;

public class Main{
	public static void main(String[] args) {
		
		int[][] sparseMatrix1 = {
		        {0 , 0 , 3 , 0 },
		        {0 , 0 , 0 , 7 },
		        {3 , 0 , 0 , 6 },
		        {0 , 7 , 6 , 0 }};
		
		int[][] sparseMatrix2 = {
		        {2 , 0 , 0 , 0 },
		        {0 , 1 , 0 , 0 },
		        {3 , 0 , 0 , 2 },
		        {0 , 1 , 0 , 0 }};
		
	int size = 0;
		
	    for (int i = 0; i < 4; i++)
	        for (int j = 0; j < 4; j++)
	            if (sparseMatrix1[i][j] != 0)
	                size++;
	    
	    int[][] compactMatrix = new int[3][size];
	    
	    int k = 0;
	    for (int i = 0; i < 4; i++)
	        for (int j = 0; j < 4; j++)
	            if (sparseMatrix1[i][j] != 0)
	            {
	                compactMatrix[0][k] = i;
	                compactMatrix[1][k] = j;
	                compactMatrix[2][k] = sparseMatrix1[i][j];
	                k++;
	            }
	    
	    String str;
	    System.out.println("Non zero Sparce Matrix 1: ");
	    for (int i = 0; i < 3; i++) {
	    	if(i==0)
	    		str = "Row: ";
	    	else if(i==1)
	    		str = "Col: ";
	    	else
	    		str = "Val: ";
	    	
	    	System.out.print(str);
	        for (int j = 0; j < size; j++) {
	        	System.out.print(compactMatrix[i][j] + " ");
	        }
	        System.out.println();
	    } 


	    int size1 = 0;
		
	    System.out.println("\nNon zero Sparce Matrix 2: ");
	    
	    for (int i = 0; i < 4; i++)
	        for (int j = 0; j < 4; j++)
	            if (sparseMatrix2[i][j] != 0)
	                size1++;
	    
	    int[][] compactMatrix1 = new int[3][size1];
	    
	    int k1 = 0;
	    for (int i = 0; i < 4; i++)
	        for (int j = 0; j < 4; j++)
	            if (sparseMatrix2[i][j] != 0)
	            {
	                compactMatrix1[0][k1] = i;
	                compactMatrix1[1][k1] = j;
	                compactMatrix1[2][k1] = sparseMatrix2[i][j];
	                k1++;
	            }
	    
	    for (int i = 0; i < 3; i++) {
	    	if(i==0)
	    		str = "Row: ";
	    	else if(i==1)
	    		str = "Col: ";
	    	else
	    		str = "Val: ";
	    	
	    	System.out.print(str);
	        for (int j = 0; j < size1; j++) {
	        	System.out.print(compactMatrix1[i][j] + " ");
	        }
	        System.out.println();
	    } 
        System.out.println();
        
	    SparseMatrix s = new SparseMatrix(compactMatrix, size, 4,4);
	    int[][] t=s.transpose();

	    System.out.println("\nTranspose of Matrix 1: ");

	    for (int i = 0; i < 3; i++) {
	    	if(i==0)
	    		str = "Row: ";
	    	else if(i==1)
	    		str = "Col: ";
	    	else
	    		str = "Val: ";
	    	
	    	System.out.print(str);
	        for (int j = 0; j < size; j++) {
	        	System.out.print(t[i][j] + " ");
	        }
	        System.out.println();
	    }
	    
	    SparseMatrix s1 = new SparseMatrix(compactMatrix1, size1, 4,4);
	    int[][] t1=s1.transpose();

	    System.out.println("\nTranspose of Matrix 2: ");
	    
	    for (int i = 0; i < 3; i++) {
	    	if(i==0)
	    		str = "Row: ";
	    	else if(i==1)
	    		str = "Col: ";
	    	else
	    		str = "Val: ";
	    	
	    	System.out.print(str);
	        for (int j = 0; j < size1; j++) {
	        	System.out.print(t1[i][j] + " ");
	        }
	        System.out.println();
	    }
	    
	    System.out.println();
	    
		if(s.isSymmetric()) {
			System.out.println("\nMatrix 1 is Symmetrical");
		}
		else {
			System.out.println("\nMatrix 1 is not Symmetrical");
		}
		
		if(s1.isSymmetric()) {
			System.out.println("\nMatrix 2 is Symmetrical\n");
		}
		else {
			System.out.println("\nMatrix 2 is not Symmetrical");
		}
	    
		System.out.println("\nAddition result: ");
		s.add(s1);
		
		System.out.println();
		
		System.out.println("Multiplication result: ");
		s.multiply(s1);
	}
}