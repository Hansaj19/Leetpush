class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        String ans="";
        for(int i=n-1;i>=0;i--){
            int digit = num.charAt(i)-'0';
            if((digit&1)==1){
                ans+=num.substring(0,i+1);
                return ans;
            }
        }
        return "";
    }
}