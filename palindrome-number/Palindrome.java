class Solution {
    public boolean isPalindrome(int x) {
       if(x<0){
        return false;
       }
       int n = x;
       int sum = 0;
       while (x!=0){
        int digi = x%10;
        sum = sum*10 + digi;
        x=x/10;
        
       } 
       if (sum==n){
        return true;
       }
       else{
        return false;
       }
    }
}