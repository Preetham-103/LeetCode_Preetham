class Solution {
    public boolean canJump(int[] nums) {
        int jump = 0;

        int i=0;

        while(i <= nums.length)
        {
            if(i > jump)
            {
                return false;
            }

            jump = Math.max(jump,i+nums[i]);

            if(jump >= nums.length-1)
            {
                return true;
            }
            i++;
        }
        return false;
    }
}