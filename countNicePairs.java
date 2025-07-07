class Solution {
    public int reverseNum(int num){
        int rev=0;
        while (num!=0){
            rev=rev*10 + num%10;
            num/=10;
        }
        return rev;
    }
    public int countNicePairs(int[] nums) {
        final int MOD = 1_000_000_007;
        Map<Integer, Integer> map = new HashMap<>();
        long result = 0;

        for (int num : nums) {
            int key = num - reverseNum(num); 
            result = (result + map.getOrDefault(key, 0)) % MOD;
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return (int) result;
    }

}