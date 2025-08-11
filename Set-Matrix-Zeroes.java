class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int extra = 1;  // Tracks if first column has zero
        int rowExtra = 1; // NEW: Tracks if first row has zero

        // Step 1: Detect if first row has zero
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                rowExtra = 0;
                break;
            }
        }

        // Step 2: Detect if first column has zero (same as your 'extra' logic)
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                extra = 0;
                break;
            }
        }

        // Step 3: Mark zero rows/cols using first row & col
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 4: Set zeroes based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 5: Zero first row if needed
        if (rowExtra == 0) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 6: Zero first column if needed
        if (extra == 0) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
