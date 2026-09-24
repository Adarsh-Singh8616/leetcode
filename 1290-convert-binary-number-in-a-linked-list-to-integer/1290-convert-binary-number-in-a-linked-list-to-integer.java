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
    public int getDecimalValue(ListNode head) {
        ListNode curr = head; 
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode temp = prev;
        int sum = 0;
        int count = 0;
        while(temp != null){
            if(temp.val == 1){
                sum += (int)Math.pow(2,count);
            }
            count++;
            temp = temp.next;
        }
        return sum;
    }
}