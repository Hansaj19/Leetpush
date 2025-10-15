class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int []hmap = new int [26];
        int n = s.length();
        for(int i=0;i<n;i++){
            hmap[(s.charAt(i)-'a')]++;
        }
        for(int i=0;i<n;i++){
            hmap[(t.charAt(i)-'a')]--;
        }
        for(int i=0;i<26;i++){
            if(hmap[i]!=0)return false;
        }
        return true;
    }
}