class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int t = target-'a';
        int num = 0,i=0;
        int flag=0;
        // int low = 0;
        // int high = letters.length-1;
        // while(low<=high){
        //     int mid = (low+high)>>1;
        //     num = letters[mid]-'a';
        //     if(num>t){
        //         flag=1;
        //         t=num;
        //     }
        //     else if(){

        //     }
        // }
        for(i=0;i<letters.length;i++){
            num = letters[i]-'a';
            if(num>t){
                flag=1;
                t=num;
                break;
            }
        }
        if(flag==0)return letters[0];
        return (char)(t+'a');
    }
}