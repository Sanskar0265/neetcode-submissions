class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] fixedArray = new int[2];
        for(int i = 0; i< nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    fixedArray[0] = i; 
                    fixedArray[1] = j;
                    return fixedArray;
                }
            }
        }
        return fixedArray;
    }
}
