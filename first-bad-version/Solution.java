/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start <= end){
            int mid = start + (end - start) / 2;
            boolean res = isBadVersion(mid);
            if(res){
                end = mid;
                if(!isBadVersion(end-1)){
                    return end;
                }
            }
            else if(!res){
                start = mid + 1;
            }
        }
        return 0;
    }
}