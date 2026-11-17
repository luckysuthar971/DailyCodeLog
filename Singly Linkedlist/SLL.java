public class SLL {

    private Node head;
    private Node tail;
    private int size;

    public SLL() {
        this.size = 0;
    }

    // Insert at First Position
    public void FirstInsert(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void LastInsert(int val) {
        if (tail == null) {
            FirstInsert(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size++;
    }

    public void InsertIndex(int val, int index) {
        if (index == 0) {
            FirstInsert(val);
            return;
        }
        if (index == size - 1) {
            LastInsert(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int FirstDelete() {
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }

        size--;
        return val;
    }

    public int LastDeletion() {
        if (size <= 1) {
            FirstDelete();
            return 0;
        }
        int val = tail.val;
        Node temp = head;
        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;

        size--;
        return val;
    }

    public int Delete(int index){
        if(index == 0){
            return FirstDelete();
        }
        if(index == size - 1){
            return LastDeletion();
        }

        Node temp = Find(index - 1);
        int val = temp.next.val;
        temp.next = temp.next.next;

        size--;
        return val;
    }

    public Node Find(int index) {
        if (head == null && tail == null) {
            return null;
        }
        Node temp = head;
        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

}