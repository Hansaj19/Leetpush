class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n  = arr.length;
        int low = 0;
        int high = n-1;
        //number of missing element till the i-th index = arr[i]-i-1;
        while(low<=high){
            int mid = (low+high)/2;
            int missed = arr[mid]-(mid+1);
            if(k > missed){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return k+low;
    }
}