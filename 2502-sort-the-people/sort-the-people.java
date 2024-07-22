class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;

        for(int i=0; i<n; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(heights[i] < heights[j])
                {
                    int temp = heights[j];
                    heights[j] = heights[i];
                    heights[i] = temp;

                    String temp2 = names[j];
                    names[j] = names[i];
                    names[i] = temp2;
                }
            }
        }

        // for(int i= n-1; i>=0; i--)
        // {
        //     System.out.print(names[i]);
        // }
        return names;
    }
}