class Solution {
    public int maxDepth(String s) {
        char sArr[] = s.toCharArray();
        int count = 0;
        int maxcount = 0;
        for(char c : sArr){
            if(c=='(')count++;
            if(c==')'){
                maxcount = Math.max(maxcount,count);
                count--;
            }
        }
        return maxcount;
    }
}