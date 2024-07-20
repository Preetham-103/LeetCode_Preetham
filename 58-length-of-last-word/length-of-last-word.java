class Solution {
    public int lengthOfLastWord(String s) {
        s =s.trim();
        int n = s.length();
        ArrayList<Character> arr = new ArrayList<Character>();
        
        for(int i=n-1; i>=0; i--)
        {
            if(s.charAt(i) != ' ')
            {
                arr.add(s.charAt(i));
            }
            else if(s.charAt(i) == ' ')
            {
                break;
            }
        }
        return arr.size();
    }
}