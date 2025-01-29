class Solution {
    public int[] prefix(int[] height)
    {
        int left[] = new int[height.length];
        left[0] = height[0];

        for(int i=1; i<height.length; i++)
        {
            left[i] = Math.max(left[i-1],height[i]);
        }
        return left;
    }

    public int[] sufix(int[] height)
    {
        int right[] = new int[height.length];
        right[height.length-1] = height[height.length-1];

        for(int i = height.length-2; i>=0 ; i--)
        {
            right[i] = Math.max(right[i+1],height[i]);
        }
        return right;
    }

    public int trap(int[] height) {
        int total = 0;

        if(height.length == 0)
        {
            return 0;
        }
        int[] leftside = prefix(height);
        int[] rightside = sufix(height);
        for(int i=0; i<height.length; i++)
        {
            int left = leftside[i];
            int right = rightside[i];

            total += Math.min(left,right) - height[i];
        }
        return total;
    }
}