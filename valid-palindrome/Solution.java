class Solution {
    public boolean isPalindrome(String s) {
        String trimed = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        if(trimed.isEmpty()){
            return true;
        }
        String rev = "";
        int left = 0;
        int right = trimed.length()-1;
        while(left<right){
            if(trimed.charAt(left)!=trimed.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}