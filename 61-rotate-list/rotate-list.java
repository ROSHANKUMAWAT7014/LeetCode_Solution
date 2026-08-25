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
        if(head==null || k==0){
            return head;
        }
        int len=1;
        ListNode tail=head;
        ListNode node =head;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        k=k%len;
        int n=len-k;
        for(int i=1;i<n;i++){
            node=node.next;
        }
        tail.next=head;
        head=node.next;
        node.next=null;
        return head;
    }
}