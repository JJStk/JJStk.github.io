class DubLinkList {
    
    private Node head;
    private Node tail;

    public DubLinkList() {

        this.head = null;
        this.tail = null;

    }

    public void apply(int data) {

        Node bucket = new Node(data);

        if (tail == null) {
            head = tail = bucket;
        } else {
            tail.next = bucket;
            bucket.prev = tail;
            tail = bucket;
        }
    }

    public void preapply(int data) {

        Node bucket = new Node(data);

        if (head == null) {
            head = tail = bucket;
        } else {
            bucket.next = head;
            head.prev = bucket;
            head = bucket;
        }
    }

    public void eraser(int data) {

        Node current = head;

        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                current = null;
                return;
            }
            current = current.next;
        }
    }

    public void Forward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "\n");
            current = current.next;
        }
        System.out.println("End");
    }

    public void Reverse() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + "\n");
            current = current.prev;
        }
        System.out.println("End");
    }

}
