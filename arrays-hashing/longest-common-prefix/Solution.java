class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        if(strs.length==0){
            return s;
        }
        for(int i=0;i<strs[0].length();i++){
            for(int j=0;j<strs.length;j++){
                if(i>=strs[j].length()){
                    return s;
                }
                if(strs[j].charAt(i)==strs[0].charAt(i)){
                    if(j==strs.length-1){
                        s+=strs[0].charAt(i);
                    }
                }
                else{
                    return s;
                }
            }
        }
        return s;
    }
}