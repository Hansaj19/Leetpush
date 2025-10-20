class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int high = row*col-1;
        int low = 0;
        while(low<=high){
            int mid = (low+high)/2;
            int i = mid / col;
            int j = mid % col;
            if(matrix[i][j]>target){
                high = mid-1;
            }
            else if(matrix[i][j]<target){
                low = mid+1;
            }
            else{
                return true;
            }
        }
        return false;
        /*
        Since the 2d-array is like 1d-array with segments.
        Current TC is m*n
        To optimize it we have to make it log(m*n)
        In 1d-binary mid was low+high /2
        In 2d it will be the same but i have to handle the indexes.
        like high = m*n and low = 0.
       
        mid = 5;
        row = 5 mod 3
        col = 5 div 3
        if m[row][col]>target:
            high = mid-1;
        else:
            low = mid+1;
        */
    }
}