class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1, temp2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        int carry = 0;

        while (temp1 != null || temp2 != null || carry != 0) {
            int val1 = (temp1 != null) ? temp1.val : 0;
            int val2 = (temp2 != null) ? temp2.val : 0;
            
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            
            ans.next = new ListNode(sum % 10);    
            ans = ans.next;

            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }

        return dummy.next;
    }
}