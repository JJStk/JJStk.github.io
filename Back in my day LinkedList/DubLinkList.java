import org.w3c.dom.Node;

class DubLinkList {
    
    private Node head;
    private Node tail;

    public DubLinkList() {

        this.head = null;
        this.tail = null;

    }

    // The queuer. One below (behind) the other.
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


    // The stacker. One atop the other.
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

    // Erases nodes, it vaporises any and all contents in the bucket.
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


    // Reads the stack in the intended way, you're staring at a bucket.
    public void Forward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "\n");
            current = current.next;
        }
        System.out.println("End");
    }

    // Reverses the stack, flips the bucket... somehow.
    public void Reverse() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + "\n");
            current = current.prev;
        }
        System.out.println("End");
    }

    // Everything above this line is my previous code which works as half the functions of a stack and queue.
    // Those functions are the addition parts, but I had none of the removal. But not anymore...

    
    public int Ladle() {  // Stack popper
        if (head == null) {
            throw new RuntimeException("Fill the bucket, then try again.");
        }
        int value = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        return value;
    }

    public int GetOuttaLine() {  // Dequeuer
        if (head == null) {
            throw new RuntimeException("Line's empty");
        }
        int value = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        return value;
    }

    public int peer() {  // Peek
        if (head == null) {
            throw new RuntimeException("The bucket is empty, you didn't fill it.");
        }
        return head.data;
    }






}
