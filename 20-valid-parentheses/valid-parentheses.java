class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(char c : s.toCharArray())
        {
            if(c=='(' || c == '[' || c == '{')
            {
                st.push(c);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                else
                {
                    char top = st.peek();

                    if((top == '(' && c == ')') || (top =='{' && c == '}') || (top == '[' && c == ']'))
                    {
                        st.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}