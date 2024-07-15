/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        if(head.next == null && nums.length == 0)
        {
            return 1;
        }
        
        HashMap<Integer,Integer> hash = new HashMap<>();

        int count = nums.length;
        boolean flag = false;

        for(int i:nums)
        {
            hash.put(i,null);
        }

        while(head != null)
        {
            if(hash.containsKey(head.val))
            {
                if(flag)
                {
                    count--;
                }
                else
                {
                    flag = true;
                }
            }
            else
            {
                flag = false;
            }
            head = head.next;
        }
        return count;
    }
}