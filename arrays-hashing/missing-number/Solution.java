class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            if(nums[i-1]!=nums[i]-1){
                return nums[i]-1;
            }
        }
        if(nums[0]!=0){
            return 0;
        }
        return n;
    }
}