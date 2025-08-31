class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ls = new ArrayList<>(); 
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
        for (int i = 0; i < n; i++) {
            if(count1==0 && nums[i]!=el2){
                count1++;
                el1=nums[i];
            }
            else if(count2==0 && nums[i]!=el1){
                count2++;
                el2=nums[i];
            }
            else if(el1==nums[i])count1++;
            else if(el2==nums[i])count2++;
            else{
                count1--;
                count2--;
            }
        }
        int cnt1 = 0; int cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el1) cnt1++;
            if (nums[i] == el2) cnt2++;
        }

        int mini = (int)(n / 3) + 1;
        if (cnt1 >= mini) ls.add(el1);
        if (cnt2 >= mini) ls.add(el2);

        return ls;
    }
}