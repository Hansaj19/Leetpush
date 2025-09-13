class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });

        List<int[]>ans = new ArrayList<>();
        ans.add(new int[] {intervals[0][0],intervals[0][1]});

        for(int i=0; i<n; i++)
        {
            int[] last = ans.get(ans.size()-1);

            if(last[1]>=intervals[i][0])
            {
                last[1] = Math.max(last[1],intervals[i][1]);
            }
            else
            {
                ans.add(new int[]{intervals[i][0], intervals[i][1]});
            }
        }
        return ans.toArray(new int [ans.size()][]);
    }
}
