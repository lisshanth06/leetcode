class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        char c;
        for(int i=0;i<sentence.length();i++){
            c = sentence.charAt(i);
            set.add(c);
        }
        if(set.size()==26){
            return true;
        }  
        return false;   
    }
}