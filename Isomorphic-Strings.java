class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map <Character,Character> mapSt = new HashMap<>();
        Map <Character,Character> mapTs = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(mapSt.containsKey(cs)){
                if(mapSt.get(cs)!=ct) return false;
            }
            else{
                mapSt.put(cs,ct);// (key,value)
            }
            if(mapTs.containsKey(ct)){
                if(mapTs.get(ct)!=cs) return false;
            }
            else{
                mapTs.put(ct,cs);
            }
        }
        return true;
    }
}