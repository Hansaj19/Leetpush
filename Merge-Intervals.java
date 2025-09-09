class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // sort by start time
        int[][] merged = new int[n][2];
        
        int index = 0;  // pointer for merged array
        merged[0] = intervals[0];  // pehla interval copy kar diya

        for (int i = 1; i < n; i++) {
            // agar overlap hai
            if (intervals[i][0] <= merged[index][1]) {
                merged[index][1] = Math.max(merged[index][1], intervals[i][1]);
            } else {
                // no overlap -> new interval start hoga
                index++;
                merged[index] = intervals[i];
            }
        }

        // index+1 hi actual merged size hai
        return Arrays.copyOf(merged, index + 1);
    }
}
