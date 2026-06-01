class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        // We must initialize the array with 1s because default is 0, 
        // and we will be multiplying into these slots.
        java.util.Arrays.fill(res, 1);

        int left = 1;
        int right = 1;
        
        for (int i = 0; i < n; i++) {
            // Update the prefix product from the left
            res[i] *= left;
            left *= nums[i];

            // Update the postfix product from the right
            res[n - 1 - i] *= right;
            right *= nums[n - 1 - i];
        }

        return res;
    }
}