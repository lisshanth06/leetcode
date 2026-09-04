class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double winsum = 0;
        for(int i=0;i<k;i++){
            winsum += nums[i];  
        }
        double max = winsum/k;
        for(int i=k;i<n;i++){
            winsum = winsum - nums[i-k] + nums[i];
            max = Math.max(winsum/k,max);
        }
        return max;
    }
}