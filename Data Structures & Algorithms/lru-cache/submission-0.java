class LRUCache {
    class Node{
        int key;
        int val;
        Node prev;
        Node next;

        public Node(int key,int val){
            this.key = key;
            this.val = val;
            this.prev = this.next = null;
        }
    }
    HashMap<Integer,Node> map;
    Node head;
    Node tail;
    int capacity;

    public void addNode(Node newNode){
        Node curr = head.next;
        head.next = newNode;
        curr.prev = newNode;
        newNode.prev = head ;
        newNode.next = curr;
    }

    public void deleteNode(Node oldNode){
        Node oldPrev = oldNode.prev;
        Node oldNext = oldNode.next;
        oldPrev.next = oldNext;
        oldNext.prev = oldPrev;
    }
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head; 
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node curr = map.get(key);
        deleteNode(curr);
        addNode(curr);
        return curr.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            deleteNode(map.get(key));
            map.remove(key);
        }
        if(map.size()==capacity){
            map.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        Node curr = new Node(key,value);
        addNode(curr);
        map.put(key,curr);
    }
}
