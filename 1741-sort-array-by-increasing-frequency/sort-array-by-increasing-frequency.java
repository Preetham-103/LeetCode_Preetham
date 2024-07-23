class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        Comparator<Integer> comp = (a,b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);

            if( freqA != freqB)
            {
                return freqA - freqB;
            }
            else
            {
                return b-a;
            }
        };

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int num : nums)
        {
            arr.add(num);
        }

        Collections.sort(arr,comp);


        for(int i = 0; i<nums.length; i++)
        {
            nums[i] = arr.get(i);
        }
        return nums;
    }
}