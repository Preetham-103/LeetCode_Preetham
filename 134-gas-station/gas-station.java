class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas = 0;
        int curr_gas = 0;
        int station_index = 0;

        for(int i=0; i<gas.length; i++)
        {
            total_gas += gas[i]-cost[i];
            curr_gas +=gas[i]-cost[i];

            if(curr_gas <0 )
            {
                station_index = i+1;
                curr_gas = 0;
            }
        }

        int res = total_gas>=0 ? station_index : -1;

        return res;
    }
}