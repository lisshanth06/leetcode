class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        if(n==1){
            return nums;
        }
        int i=0;
        int k=0;
        while(i<n){
            if(nums[i]%2==0){
                arr[k]=nums[i];
                k++;
            }
            i++;
        }
        int j=0;
        while(j<n){
            if(nums[j]%2!=0){
                arr[k]=nums[j];
                k++;
            }
            j++;
        }
        return arr;
    }
}