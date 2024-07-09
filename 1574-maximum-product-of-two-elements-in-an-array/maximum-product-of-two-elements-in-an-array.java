class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        // int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            for(int j =i+1; j<nums.length; j++)
            {
                int a = (nums[i]-1)*(nums[j]-1);

                max = Math.max(max,a);
            }
        }
        return max;
    }
}