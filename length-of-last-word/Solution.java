class Solution {
    public int lengthOfLastWord(String s) {
        char[] arr = s.toCharArray();
        int count =0;
        int n=arr.length;
        for(int i=n;i>0;i--){
            if(arr[n-1]==' '){
                n--;
            }
        }
        for(int i=n;i>0;i--){
            if(s.charAt(i-1)==' '){
                 break;
            }
            count++;
        }
        return count;
    }
}