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
        if (head == null) return null;
        HashMap<Node, Node> map = new HashMap<>();
        Node curr = head;
        Node newHead = new Node(curr.val);
        Node newCurr = newHead;
        map.put(curr, newHead);
        curr = curr.next;
        while (curr != null) {
            newCurr.next = new Node(curr.val);
            map.put(curr, newCurr.next);
            newCurr = newCurr.next;
            curr = curr.next;
        }
        newCurr = newHead;
        curr = head;
        while (newCurr != null) {
            newCurr.random = map.get(curr.random);
            newCurr = newCurr.next;
            curr = curr.next;
        }
        return newHead;
    }
}
