class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> paired = new HashSet<>();
        for(int i : nums){
            if(paired.contains(i)){
                return true;
            } else{
                paired.add(i);
            }
        }
        return false;
    }
}