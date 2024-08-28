class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int maxLength = 0;
        int left = 0;

        for(int right = 0; right<s.length(); right++)
        {
            char current = s.charAt(right);

            while(set.contains(current))
            {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(current);

            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength; 
    }
}