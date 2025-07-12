public class countSubarrays {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        long ans = 0;
        int leftBound = -1, lastMin = -1, lastMax = -1;

        for (int i = 0; i < n; ++i) {
            if (nums[i] < minK || nums[i] > maxK) {
                leftBound = i;
            }
            if (nums[i] == minK) {
                lastMin = i;
            }
            if (nums[i] == maxK) {
                lastMax = i;
            }
            int minLast = Math.min(lastMin, lastMax);
            if (minLast > leftBound) {
                ans += minLast - leftBound;
            }
        }
        return ans;
    }
}
