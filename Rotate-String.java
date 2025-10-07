class Solution {
    private boolean checkRotation(String s, String goal, int start){
        int i = start;
        int j = 0;
        while(i!=start-1 && j<goal.length()){
            if(s.charAt(i)==goal.charAt(j)){
                j++;
                i++;
            }
            else return false;
            i=i%s.length();
        }
        return true;
    }
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==goal.charAt(0)){
                if(checkRotation(s,goal,i)){
                    return true;
                };
            }
        }
        return false;
    }
}