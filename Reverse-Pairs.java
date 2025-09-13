class Solution {
    void merge(int []nums, int lb, int mid, int ub){
        int left = lb;
        int right = mid+1;
        ArrayList<Integer>b = new ArrayList<>();
        while(left<=mid && right<=ub)
        {
            if(nums[left]<=nums[right]){
                b.add(nums[left++]);
            }
            else{
                b.add(nums[right++]);
            }
            
        }
        while(left<=mid){
            b.add(nums[left++]);
        }
        while(right<=ub){
            b.add(nums[right++]);
        }
        for(int i=lb; i<=ub ; i++){
            nums[i] = b.get(i - lb);
        }
    }

    int countPairs(int []arr, int lb, int mid, int ub){
        int right = mid+1;
        int cnt=0;
        for(int i=lb;i<=mid;i++){
            while(right<=ub && (long)arr[i] > 2L * arr[right]) right++;
            cnt+=(right-(mid+1));
        }
        return cnt;
    }

    int mergesort(int [] nums, int lb, int ub){
        int cnt=0;
        if(lb>=ub) return cnt;
        int mid = (lb+ub)/2;
        cnt+=mergesort(nums,lb,mid);
        cnt+=mergesort(nums,mid+1,ub);
        cnt+=countPairs(nums, lb, mid, ub);
        merge(nums,lb,mid,ub);
        return cnt;
    }
    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
}