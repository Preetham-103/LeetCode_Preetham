class Solution {
    public String reverseWords(String s) {
        String[] res = s.trim().split("\\s+");
        String str = "";
        for(int i = res.length-1 ; i>0; i--)
        {
            str += res[i]+" ";
        }
        return str+res[0];
    }
}