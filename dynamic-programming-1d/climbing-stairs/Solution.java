class Solution {
    public int climbStairs(int n) {
        int result = 0;
        int sum = 0;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int t1 = 1;
        int t2 = 2;
        int i = 3;
        while(i<=n){
            sum = t1+t2;
            t1=t2;
            t2=sum;
            i++;
        }
        return t2;
    }
}