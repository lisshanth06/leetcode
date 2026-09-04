class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> revmap = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }                
            }
            if(revmap.containsKey(t.charAt(i))){
                if(revmap.get(t.charAt(i))!=s.charAt(i)){
                    return false;
                }
            }  
            revmap.put(t.charAt(i),s.charAt(i));
            map.put(s.charAt(i),t.charAt(i));
        }
         
        return true;
    }
}