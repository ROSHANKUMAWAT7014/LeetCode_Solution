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
    public ListNode middleNode(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode temp = head;
        int len =0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        int mid=0;
        if(len%2==0){
            mid =(len/2)+1;
        }
        else{
            mid =(len+1)/2;
        }
        ListNode curr =head;
        while(mid>1){
            curr=curr.next;
            mid--;
        }
        return curr;
    }
}