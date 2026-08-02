class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],true);
        }
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        return list;
    }
}