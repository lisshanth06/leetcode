class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        double winsum = 0;
        for(int i=0;i<k;i++){
            winsum += arr[i];
        }
        int count = 0;
        if((winsum/k)>=threshold){
            count++;
        }
        for(int i=k;i<n;i++){
            winsum = winsum - arr[i-k] + arr[i];
            if((winsum/k)>=threshold){
            count++;
            }
        }
        return count;
    }
}