class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;
        // ArrayList<Integer> arr = new ArrayList<Integer>();

        int[] arr = new int[range+1];
        
        Arrays.fill(arr,-1);

        // for(int i=0; i<nums.length; i++)
        // {
        //     arr.add(-1);
        // }

        for(int i=0; i<range; i++)
        {
            // arr.get(nums[i]) = nums[i];
            arr[nums[i]] = nums[i];
        }

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == -1)
            {
                return i;
            }
        }
        return 0;     
    }
}