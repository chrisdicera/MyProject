

public class LinkedList {


    
    public class Node {

        String item;
        Node next;

        public Node(String item) {

            this.item = item;
            this.next = null;

        }
    }

    private Node head;
    private int size;

    public LinkedList() {

        head = null;
        size = 0;

    }

    public void add(String item) {
        
        Node newNode = new Node(item);

        if (head == null) {

            head = newNode;

        } else {

            Node curr = head;

            while (curr.next != null) {

                curr = curr.next;

            }

            curr.next = newNode;
        }

        size++;
    }

    public void remove(String item) {

        if (head == null) {

            return;

        }

        if (head.item.equals(item)) {

            head = head.next;
            size--;

            return;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {

            if (curr.item.equals(item)) {
                prev.next = curr.next;
                size--;
                return;
            }

            prev = curr;
            curr = curr.next;
        }

    }

    public int getSize() {
        return size;
    }

    public void printList() {

        Node curr = head;

        while (curr != null) {
            System.out.println(curr.item);
            curr = curr.next;

        }
    }
}
