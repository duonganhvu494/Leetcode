class Solution {

    public int cal(int x,int y){
        for (int i=2;i<=x;i++){
            if (y%i==0) return i;
        }
        return -1;

    }
    public int minOperations(int[] nums) {
        int count=0;
        for (int i=nums.length-1;i>=1;i--){
            if (nums[i]<nums[i-1]){
                nums[i-1]=cal(nums[i],nums[i-1]);
                if (nums[i-1]==-1) return -1;
                count++;
            }
        }

        return count;
    }

    public static void main(String []args){
        Solution solution = new Solution();
        System.out.println(solution.minOperations(new int[]{9,27,81,27,3}));
    }
}