class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        if (n == 0) return -1; // Edge case: empty array
        
        int prefix[] = new int[n];
        int suffix[] = new int[n];

        // Compute prefix sum
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Compute suffix sum
        suffix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums[i];
        }

        // Find pivot index
        for (int i = 0; i < n; i++) {
            int leftSum = (i == 0) ? 0 : prefix[i - 1];
            int rightSum = (i == n - 1) ? 0 : suffix[i + 1];

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}
