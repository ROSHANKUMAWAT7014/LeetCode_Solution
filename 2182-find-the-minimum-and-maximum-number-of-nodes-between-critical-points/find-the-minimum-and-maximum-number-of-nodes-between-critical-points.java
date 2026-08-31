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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans={-1,-1};
        if(head==null || head.next==null){
            return ans;
        }
        int minima=Integer.MAX_VALUE;
        ListNode node =head;
        ListNode temp=node.next;
        int idx=2;
        List<Integer> list =new ArrayList<>();
        while (temp.next != null) {
            if ((node.val > temp.val && temp.val < temp.next.val) ||
                (node.val < temp.val && temp.val > temp.next.val)) {
                list.add(idx);
            }
            idx++;
            node = node.next;
            temp = temp.next;
        }
        if (list.size() < 2) {
            return new int[]{-1, -1};
        }
        for (int i = 0; i < list.size() - 1; i++) {
            minima = Math.min(minima, list.get(i + 1) - list.get(i));
        }

        int maxima = list.get(list.size() - 1) - list.get(0);
        return new int[]{minima,maxima};
    }
}