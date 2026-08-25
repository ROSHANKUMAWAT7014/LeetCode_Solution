/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return head;
        }
        Node copy = new Node(head.val);
        Node copyhead=copy;
        Node tail=head;
        
       
        while(tail.next!=null){
            tail=tail.next;
            copy.next=new Node(tail.val);
            copy=copy.next;
        }
        HashMap<Node, Node> map = new HashMap<>();
        Node node1=head;
        Node node2=copyhead;
        while(node1!=null){
            map.put(node1,node2);
            node1=node1.next;
            node2=node2.next;
        }
        node1=head;
        node2=copyhead;
        while(node1 != null){
            node2.random = map.get(node1.random);
            node1 = node1.next;
            node2 = node2.next;
        }
        return copyhead;
    }
}