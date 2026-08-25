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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode ans=new ListNode();
        ListNode result =ans;
        int b=0;

        while(temp1!=null || temp2!=null || b!=0){
            int val1=(temp1!=null)? temp1.val:0;
            int val2=(temp2!=null)? temp2.val:0;
            int a=val1+val2+b;
            if(a<10){
                ListNode node1= new ListNode(a);
                ans.next=node1;
                ans=ans.next;
                b=0;
            }
            else{
                ListNode node2= new ListNode(a-10);
                ans.next=node2;
                b=1;
                ans=ans.next;
            }
            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }
    return result.next;
    }
}