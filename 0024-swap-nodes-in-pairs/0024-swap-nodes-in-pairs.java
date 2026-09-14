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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        head = head.next;

        while(temp != null && temp.next != null){
            ListNode n1 = temp;
            ListNode n2 = temp.next;

            n1.next = n2.next;
            n2.next = n1;
            temp = n1.next;

            if(temp != null && temp.next != null){
                n1.next = temp.next;
            }
        }
        return head;
    }
}