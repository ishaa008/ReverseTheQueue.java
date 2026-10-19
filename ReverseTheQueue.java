
public class ReverseTheQueue {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Reverse the linked list in place
    static Node reverse(Node head) {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;       // Save next node
            current.next = previous;   // Reverse the link
            previous = current;        // Move previous forward
            current = next;            // Move current forward
        }

        return previous;
    }

    // Add a node at the end
    static Node addLast(Node head, int value) {
        Node newNode = new Node(value);

        if (head == null) {
            return newNode;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        return head;
    }

    // Display the linked list
    static void display(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = null;

        // Sample queue: 1 -> 2 -> 3 -> 4
        head = addLast(head, 1);
        head = addLast(head, 2);
        head = addLast(head, 3);
        head = addLast(head, 4);

        System.out.println("Original queue:");
        display(head);

        head = reverse(head);

        System.out.println("Reversed queue:");
        display(head);
    }
}
