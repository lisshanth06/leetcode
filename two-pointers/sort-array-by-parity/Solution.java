class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[slow];
                nums[slow] = nums[i];
                nums[i] = temp;
                slow++;
            }
        }
        return nums;
    }
}