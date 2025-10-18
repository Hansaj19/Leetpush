class Solution {
    public int returnNum(char c){
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // error handling
        }
    }
    public int romanToInt(String s) {
        char[] sArr = s.toCharArray();
        int n = sArr.length;
        int num = 0;
        int value = 0;
        for(int i=0;i<n;i++){
            if (i<n-1 && ((sArr[i] == 'I' && sArr[i+1] == 'V') ||
                (sArr[i] == 'I' && sArr[i+1] == 'X') ||
                (sArr[i] == 'X' && sArr[i+1] == 'L') ||
                (sArr[i] == 'X' && sArr[i+1] == 'C') ||
                (sArr[i] == 'C' && sArr[i+1] == 'D') ||
                (sArr[i] == 'C' && sArr[i+1] == 'M'))) {
                value = returnNum(sArr[i+1])-returnNum(sArr[i]); 
                i++;
            } 
            else {
                value = returnNum(sArr[i]);
            }
            num += value;
        }
        return num;
    }
}