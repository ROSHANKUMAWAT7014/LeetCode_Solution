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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode m=getmid(head);
        ListNode left =sortList(head);
        ListNode right =sortList(m);

        return mergeTwoLists(left,right);
    }
    ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode ans=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                ans.next=list1;
                list1=list1.next;
                ans=ans.next;
            }
            else{
                ans.next=list2;
                list2=list2.next;
                ans=ans.next;
            }
        }
        ans.next=(list1!=null)? list1:list2;
        return dummy.next;
    }

    ListNode getmid(ListNode head) {
    ListNode midPrev = null;
    while (head != null && head.next != null) {
        midPrev = (midPrev == null) ? head : midPrev.next;
        head = head.next.next;
    }
    ListNode mid = midPrev.next;
    midPrev.next = null;
    return mid;
    }
}