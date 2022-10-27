package sparsematrix;

final class SparseMatrix{
	private final int[][] matrix;
	private final int size;
	private final int rows;
	private final int cols;
	
	public SparseMatrix(int[][] arr, int n, int r,int c) {
		matrix = arr;
		size = n;
		rows = r;
		cols = c;
	}
	
	/**
	 * To return transpose of the matrix.
	 * @return return transpose of the matrix.
	 */	
	public int[][] transpose() {
		
		if(this.cols  <= 0 || this.rows <= 0 || this.size <= 0) {
			throw new ArithmeticException("Invalid Matrix");
		}
		
		int[][] transpose = new int[3][this.size];
		
		int index = 0;
		
		for(int j = 0; j < this.rows; j++) {
			for(int i=0; i < this.size; i++) {
				if(matrix[1][i] == j) {
					transpose[0][index] = this.matrix[1][i];
					transpose[1][index] = this.matrix[0][i];
					transpose[2][index] = this.matrix[2][i];
					index++;
				}
			}
		}
		
		return transpose;
	}
	
	/**
	 * check whether matrix is symmetrical or not.
	 * @return return true if symmetrical or false.
	 */	
	public boolean isSymmetric() {
		
		if(rows != cols) {
			return false;
		}
		
		int[][] transpose = transpose();
		
		for (int i = 0; i < this.size; i++) {
			if (this.matrix[0][i] != transpose[0][i] || this.matrix[1][i] != transpose[1][i] || this.matrix[2][i] != transpose[2][i])
            	return false;
		}
		
		return true;
	}

	/**
	 * To add two sparse matrices.
	 */	
	public void add(SparseMatrix s) {
		
		if(this.cols  <= 0 || this.rows <= 0 || this.size <= 0) {
			throw new ArithmeticException("Invalid Matrix");
		}
		
		int[][] sparseSum = new int[3][100];
			int i = 0;
		int k = 0;
		int j = 0;
		while(i < size && j < s.size) {
			if(this.matrix[0][i] == s.matrix[0][j]) {
				if(this.matrix[1][i] == s.matrix[1][j]) {
					sparseSum[0][k] = this.matrix[0][i];
					sparseSum[1][k] = this.matrix[1][i];
					sparseSum[2][k] = this.matrix[2][i] + s.matrix[2][j];
					i++;
					j++;
					k++;
				}
				else {
					if(this.matrix[1][i] > s.matrix[1][j]) {
						sparseSum[0][k] = s.matrix[0][j];
						sparseSum[1][k] = s.matrix[1][j];
						sparseSum[2][k] = s.matrix[2][j];
						j++;
						k++;
					}
					else {
						sparseSum[0][k] = this.matrix[0][i];
						sparseSum[1][k] = this.matrix[1][i];
						sparseSum[2][k] = this.matrix[2][i];
						i++;
						k++;
					}
				}
			}
			else if(this.matrix[0][i] < s.matrix[0][j]) {
				sparseSum[0][k] = this.matrix[0][i];
				sparseSum[1][k] = this.matrix[1][i];
				sparseSum[2][k] = this.matrix[2][i];
				i++;
				k++;
			}
			else if(this.matrix[0][i] > s.matrix[0][j]) {
				sparseSum[0][k] = s.matrix[0][j];
				sparseSum[1][k] = s.matrix[1][j];
				sparseSum[2][k] = s.matrix[2][j];
				j++;
				k++;
			}
		}
		
		
		while(j < s.size && i >= size) {
			sparseSum[0][k] = s.matrix[0][i];
			sparseSum[1][k] = s.matrix[1][i];
			sparseSum[2][k] = s.matrix[2][j];
			j++;
			k++;
		}
		
		while(j >= s.size && i < size) {
			sparseSum[0][k] = this.matrix[0][i];
			sparseSum[1][k] = this.matrix[1][i];
			sparseSum[2][k] = this.matrix[2][i];
			i++;
			k++;
		}
		
		String str;
		for(int p = 0; p < 3; p++) {
			if(p==0)
	    		str = "Row: ";
	    	else if(p==1)
	    		str = "Col: ";
	    	else
	    		str = "Val: ";
	    	
	    	System.out.print(str);
			for(int q = 0; q < k; q++) {
				System.out.print(sparseSum[p][q] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * To add two sparse matrices.
	 */	
	public void multiply(SparseMatrix s) {
		
		if(this.cols  <= 0 || this.rows <= 0 || this.size <= 0) {
			throw new ArithmeticException("Invalid Matrix");
		}
		
		if(this.cols != s.rows) {
			throw new ArithmeticException("Multiplication not possible");
		}
		
		int[][] sparseProduct = new int[3][100];
		
		int[][] matrix2 = s.transpose();

		int k = 0;
		
		for(int i = 0;i < this.size; i++) {
			for(int j = 0; j < s.size; j++) {
				if(this.matrix[1][i] == matrix2[1][j]) {
					boolean flag = true;
					for(int t = 0; t < k; t++) {
						if(this.matrix[0][i] == sparseProduct[0][t] && matrix2[0][j] == sparseProduct[1][t]) {
							flag = false;
							sparseProduct[2][t] = sparseProduct[2][t] + (this.matrix[2][i] * matrix2[2][j]);
						}
					}
					if(flag) {
						sparseProduct[0][k] = this.matrix[0][i];
						sparseProduct[1][k] = matrix2[0][j];
						sparseProduct[2][k] = this.matrix[2][i] * matrix2[2][j];
						k++;
					}
				}
			}
		}
		String str;
		
		for(int p = 0; p < 3; p++) {
			if(p==0)
	    		str = "Row: ";
	    	else if(p==1)
	    		str = "Col: ";
	    	else
	    		str = "Val: ";
	    	
	    	System.out.print(str);
			for(int q = 0; q < k; q++) {
				System.out.print(sparseProduct[p][q] + " ");
			}
			System.out.println();
		}
	}
}