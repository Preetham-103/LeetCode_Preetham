class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candis = new int[n];
        Arrays.fill(candis,1);

        for(int i = 1; i<n; i++)
        {
            if(ratings[i] > ratings[i-1])
            {
                candis[i] = candis[i-1]+1;
            }
        }

        for(int i = n-2;i>=0;i--)
        {
            if(ratings[i] > ratings[i+1])
            {
                candis[i] = Math.max(candis[i],candis[i+1]+1);
            }
        }

        int totalCand = 0;

        for(int num :candis)
        {
            totalCand += num;
        }

        return totalCand;
    }
}