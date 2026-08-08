class NumMatrix {
	int[][] m;
	int[][] prefix;
    public NumMatrix(int[][] matrix) {
        m = matrix;
        prefix = new int[m.length][m[0].length];
        for(int i = 0 ; i < m.length ; i++) {
        	for(int j = 0 ; j < m[0].length ; j++) {
        		if(i == 0 && j == 0 ) {
        			prefix[i][j] = m[i][j];
        		}else if(i == 0 && j > 0) {
        			prefix[i][j] = m[i][j] + prefix[i][j-1];
        		}else if(j == 0 && i > 0) {
        			prefix[i][j] = m[i][j] + prefix[i-1][j];
        		}else {
        			prefix[i][j] = m[i][j] + prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1];
        		}
        	}
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
    	int sum = prefix[row2][col2];

    	if (row1 > 0)
    	    sum -= prefix[row1 - 1][col2];

    	if (col1 > 0)
    	    sum -= prefix[row2][col1 - 1];

    	if (row1 > 0 && col1 > 0)
    	    sum += prefix[row1 - 1][col1 - 1];
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */