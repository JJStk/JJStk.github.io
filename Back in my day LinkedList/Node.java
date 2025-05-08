class Node {
    
    int data; // Makes a place to hold data
    Node next; // A string that will make it so that I can make a chain of data sets in one direction
    Node prev; // A string that will make it so that I can make a chain of data sets in the other direction

    public Node(int data) {

        this.data = data; // making the held data a string
        this.next = null; // making so that you can put data attached to the first data set
        this.prev = null; // making so that you can put data attached to the first data set, but the other direction

    }
}
