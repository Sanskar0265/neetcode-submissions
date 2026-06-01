class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies  O(n)
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Build buckets — index = frequency, value = list of numbers
        // Frequency can be at most nums.length
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : freq.keySet()) {
            int f = freq.get(key);
            if (buckets[f] == null) buckets[f] = new ArrayList<>();
            buckets[f].add(key);
        }

        // Step 3: Collect top k — scan from highest freq bucket down
        int[] result = new int[k];
        int idx = 0;
        for (int i = buckets.length - 1; i >= 0 && idx < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[idx++] = num;
                    if (idx == k) break;
                }
            }
        }
        return result;
    }
}