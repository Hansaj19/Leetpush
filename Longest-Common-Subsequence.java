class Solution {
    // public static int helper(int i,int j,String text1,String text2,List<List<Integer>>dp){
    //     if(i<0||j<0){
    //         return 0;
    //     }
    //     if(dp.get(i).get(j)!=-1) return dp.get(i).get(j);
    //     if(text1.charAt(i)==text2.charAt(j)){
    //         int value= 1 + helper(i-1,j-1,text1,text2,dp);
    //         dp.get(i).set(j,value);
    //         return value;
    //     }
    //     else{
    //         int value=Math.max(helper(i-1,j,text1,text2,dp),helper(i,j-1,text1,text2,dp));
    //         dp.get(i).set(j,value);
    //         return value;
    //     }
            
    // }
    public int longestCommonSubsequence(String text1, String text2){
    // {   int m=text1.length();
    //     int n=text2.length();
    //     List<List<Integer>>dp = new ArrayList<>();
    //     for (int i = 0; i < m; i++) {
    //         List<Integer> row = new ArrayList<>();
    //         for (int j = 0; j < n; j++) {
    //             row.add(-1); // initialize all elements to 0
    //         }
    //         dp.add(row);
    //     }
    //     return helper(m-1,n-1,text1,text2,dp);
    
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }return dp[n][m];
    }
}