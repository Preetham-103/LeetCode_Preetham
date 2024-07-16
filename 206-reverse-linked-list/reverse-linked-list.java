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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode prev = null;
        ListNode nextNode = null;
        ListNode curr = head;

        while(curr != null)
        {
            nextNode = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}