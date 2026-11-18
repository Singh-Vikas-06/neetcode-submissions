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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode newLeft = dummy;
        ListNode prev = null;
        for(int i=0;i<left;i++){
            prev=newLeft;
            newLeft=newLeft.next;
        }
        ListNode newRight = head;
        for(int i=0;i<right-1;i++){
            newRight = newRight.next;
        }
        ListNode restLL = newRight.next;
        newRight.next = null;
        ListNode reversed = reverseLL(newLeft);
        prev.next = reversed;
        while(reversed.next!=null){
            reversed = reversed.next;
        }
        reversed.next=restLL;
        return dummy.next;
    } 
    public ListNode reverseLL(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        return prev;
    }
}