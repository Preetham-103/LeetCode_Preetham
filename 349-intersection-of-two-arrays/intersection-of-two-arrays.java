class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for(int num : nums1)
        {
            set1.add(num);
        }

        for(int num : nums2)
        {
            if(set1.contains(num))
            {
                resultSet.add(num);
            }
        }

        int[] final_set = new int[resultSet.size()];
        int index = 0;

        for(int num : resultSet)
        {
            final_set[index] = num;
            index++;
        }
        return final_set;
    }
}