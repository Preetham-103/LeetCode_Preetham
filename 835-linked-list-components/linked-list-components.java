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
        if(head == null || nums.length == 0)
        {
            return 1;
        }

        int count = nums.length;
        ListNode curr = head;
        boolean flag = false;

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums)
        {
            set.add(i);
        }

        while(curr != null)
        {
            if(set.contains(curr.val))
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
            curr = curr.next;
        }
        return count;
    }
}