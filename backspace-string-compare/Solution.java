class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] sa = new char[s.length()];
        char[] ta = new char[t.length()];
        int k = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                sa[k] = s.charAt(i);
                k++;
            }
            else{
                if(k>0)
                   k--;
            }
        }
        int l = 0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                ta[l] = t.charAt(i);
                l++;
            }
            else{ 
                if(l>0)
                    l--;
            }
        }
        if(l!=k){
            return false;
        }
        for(int i=0;i<k;i++){
        if(sa[i]!=ta[i]){
            return false;
        }
        }
        return true;
    }
}