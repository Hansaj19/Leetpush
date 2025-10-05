class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String res = strs[0];
        int len = res.length();
        int mincount = Integer.MAX_VALUE;

        if (n==0 || n==1) return res;
        if(len==0) return res;

        for(int i = 1;i<n;i++){
            int count=0;
            String temp = strs[i];
            for(int j=0;j < Math.min(res.length(), temp.length());j++){
                if(res.charAt(j)==temp.charAt(j)){
                    count++;
                }
                else{
                    break;
                }
            }
            mincount = Math.min(count,mincount);
        }
        if(mincount==0|| mincount == Integer.MAX_VALUE) return "";
        return res.substring(0,mincount);
    }
}