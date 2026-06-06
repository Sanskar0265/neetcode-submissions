class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store the number as the key and its index as the value
        Map<Integer, Integer> seenMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int complement = target - currentNum;
            
            // Check if the complement is already in our map
            if (seenMap.containsKey(complement)) {
                // Return the index of the complement and the current index
                return new int[] { seenMap.get(complement), i };
            }
            
            // If not found, add the current number and its index to the map
            seenMap.put(currentNum, i);
        }
        
        // Return an empty array if no solution is found (per problem constraints)
        return new int[] {};
    }
}
