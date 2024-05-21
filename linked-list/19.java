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
        int size = size(head);
        if (n == size) {
            head = head.next;
            return head;
        }
        int opr = size - n - 1;
        ListNode currentNode = head;
        for (int k = 1; k <= opr; k++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        return head;
    }

    public int size(ListNode head) {
        int size = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }
}
