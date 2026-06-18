class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k = nums.length;
        int [] ans = new int[k];
        int i ;
        for ( i=0;i<n;i++){
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[i+n];
        }
        return ans;
    }
}