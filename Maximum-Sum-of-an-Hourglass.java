class Solution {
    public int maxSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int sum=0,maxsum=-1;

        System.out.println(m+" "+n);
        for(int i=1;i<m-1;i++){
            for(int j=1;j<n-1;j++){
                sum=(grid[i][j]+grid[i-1][j]+grid[i+1][j]+grid[i-1][j+1]+grid[i-1][j-1]+grid[i+1][j-1]+grid[i+1][j+1]);
                maxsum = Math.max(sum,maxsum);
            }
            sum=0;
        }
        return maxsum;
    }
}