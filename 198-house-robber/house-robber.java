class Solution {
    public int rob(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        if(n==1) return Math.max(nums[0],nums[1]);

        ans[0] = nums[0];
        ans[1] = Math.max(nums[0],nums[1]);

        for(int i=2; i<nums.length; i++)
        {
            ans[i] = Math.max(ans[i-1],ans[i-2]+nums[i]);
        }

        return ans[ans.length-1]; 
    }
}