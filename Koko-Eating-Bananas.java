class Solution {
    // return totalTime ceil values of speed=mid and pile[i]/speed=time[i];
    // if totalTime<h then:= high=mid-1;
    // else totalTime>h then, we need more time and assumed rate or speed, needs to be increased:= low=mid+1;
    public boolean totalTime(int []piles,int h,int speed){
        long time = 0;
        for(int i=0;i<piles.length;i++){
            time+= (piles[i]+speed-1)/speed;
            if(time>h)return false; 
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        long sum=0;
        int high = -1;

        for(int i=0;i<n;i++){
            high = Math.max(high,piles[i]);
            sum += piles[i];
        }

        int max=high;
        int low=(int)Math.ceil((double)sum/h);
        if (low == 0) {
            low = 1;
        }
        int total=0;
        int speed=0;
        while(low<=high){
            speed = low+(high-low)/2;
            if(totalTime(piles,h,speed))high=speed-1;
            else low=speed+1;
        }
        return low;
    }
}