class Solution {
    public int longestConsecutive(int[] nums) {
        // 1. Handle edge case
        if (nums == null || nums.length == 0) return 0;
        
        // 2. Use a traditional loop to build the set (Much faster than Streams)
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int longest = 0;
        
        // 3. Iterate over the 'set' instead of 'nums' to skip duplicates entirely
        for (int n : set) {
            // Only start counting if this is the beginning of a sequence
            if (!set.contains(n - 1)) {
                int length = 1; // We already have the first number, so length starts at 1
                
                while (set.contains(n + length)) {
                    length++;
                }
                
                longest = Math.max(length, longest);
            }
        }
        
        return longest;
    }
}