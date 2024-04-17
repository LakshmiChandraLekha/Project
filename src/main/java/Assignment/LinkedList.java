package Assignment;

public class LinkedList {

    static Node head;

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printNode() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -----> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static Node reverseList(Node head) {
        Node Prev = head.next;
        Node next = head.next.next;
        head.next = null;
        while(Prev != null){

            Prev.next = head;
            head = Prev;
            Prev = next;
            if (next != null)
            next = next.next;

        }
        return head;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Creating and inserting node data
        LinkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // connection of Nodes
        LinkedList.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        LinkedList.printNode();
        LinkedList.head = LinkedList.reverseList(LinkedList.head);
        LinkedList.printNode();
    }
}
