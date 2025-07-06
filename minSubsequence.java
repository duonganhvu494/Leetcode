class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int sum=0,sum2=0;
        for (int num : nums){
            sum+=num;
        }

        for (int i=nums.length-1;i>=0; i--){
            res.add(nums[i]);
            sum2+=nums[i];
            if (sum - sum2 < sum2) break;
        }
        
        
        return res;
    }
}