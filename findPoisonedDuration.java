class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total=0;
        int n=timeSeries.length;
        if(n==0)
        return 0;
        else{
        for(int i=0;i<n-1;i++)
        { total+=Math.min(timeSeries[i+1]-timeSeries[i],duration);
        }return duration+total;
        }
    }
}
