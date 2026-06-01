class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         // Step 1: Count frequencies
        Map<Integer, Integer> data = new HashMap<>();
        for (int num : nums) {
            data.put(num, data.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort by frequency descending, take top k keys
        return data.entrySet().stream()
                   .sorted((a, b) -> b.getValue() - a.getValue())
                   .limit(k)
                   .mapToInt(Map.Entry::getKey)
                   .toArray();
    }
}
