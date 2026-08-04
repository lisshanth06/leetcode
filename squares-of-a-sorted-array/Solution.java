class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int k = 0;
        for(int i=0;i<n;i++){
            nums[k]=nums[i]*nums[i];
            k++;
        }
        Arrays.sort(nums);
        return nums;
    }
}