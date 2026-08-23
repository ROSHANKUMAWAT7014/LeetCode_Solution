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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 || head==null){
            return head;
        }
        ListNode prev =null;
        ListNode curr=head;
        while(true){
            ListNode last=prev;
            ListNode end=curr;

            ListNode nxt=curr.next;
            for(int i=0;curr!=null && i<k;i++){
                curr.next=prev;
                prev =curr;
                curr=nxt;
                if(nxt!=null){
                    nxt=nxt.next;
                }
            }

            if(last!=null){
                last.next=prev;
            }
            else{
                head=prev;
            }
            end.next=curr;
            if(curr == null){
                break;
            }
            prev =end;
            ListNode a=curr;
            int count=0;
            while(a!=null){
                count++;
                a=a.next;
            }
            if(count<k){
                return head;
            }
        }

        return head;
    }
}