public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = nums.length-k; i<nums.length; i++)
        {
            arr.add(nums[i]);
        }
        for(int i=0;i<nums.length-k; i++)
        {
            arr.add(nums[i]);
        }
        for(int i = 0; i<arr.size(); i++)
        {
            nums[i] = arr.get(i);
        }
    }
}
