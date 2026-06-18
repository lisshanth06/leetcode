class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int k = flowerbed.length;
        int count=0;
        for(int i=0;i<k;i++){
            if(flowerbed[i]==0){
                boolean right = (i==0)||(flowerbed[i-1]==0);
                boolean left = (i==k-1)||(flowerbed[i+1]==0);
                if(right&&left){
                    flowerbed[i]=1;
                    count++;
                }
        }
        }
        if(count>=n){
            return true;
        }
        else{
            return false;
        }
    }
}
