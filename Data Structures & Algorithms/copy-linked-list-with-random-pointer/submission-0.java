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
            return null;
        }
        HashMap<Node,Node> map = new HashMap<>();
        Node newHead = new Node(head.val);
        Node newList = newHead;
        Node temp = head.next;
        map.put(head,newHead);
        while(temp!=null){
            Node copyNode = new Node(temp.val);
            newList.next=copyNode;
            map.put(temp,copyNode);
            temp=temp.next;
            newList = newList.next;
        }
        Node newRand = newHead;
        while(head!=null){
            newRand.random = map.get(head.random);
            newRand = newRand.next;
            head = head.next;
        } 
        return newHead;

    }
}
