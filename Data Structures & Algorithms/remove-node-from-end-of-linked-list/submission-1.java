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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ahead = head;
        ListNode toRemove = head;
        ListNode prev = new ListNode(-100, head);
        for (int i = 1; i < n; i++) {
            ahead = ahead.next;
        }
        while (ahead.next != null) {
            prev = prev.next;
            toRemove = toRemove.next;
            ahead = ahead.next;
        }
        if (prev.next == head) {
            head = prev.next.next;
        }
        prev.next = prev.next.next;
        toRemove.next = null;
        return head;
    }
}
