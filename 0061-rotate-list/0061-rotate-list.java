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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }

        int len = 0;
        ListNode node = head;
        while(node != null){
            len++;
            node = node.next;
        }

        k = k % len;

        while(k > 0){
            ListNode temp = head;

            while(temp.next.next != null){
                temp = temp.next;
            }
            ListNode curr = temp.next;
            temp.next = null;
            curr.next = head;
            head = curr;
            
            k--;
        }
        return head;
    }
}