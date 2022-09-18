package PI.LinkedList;
public class CountingCommonElementsInTwoLinkedListNaive {
    static class Node {
        int data;
        Node next;
    };
    static int countCommonNodes(Node head1, Node head2) {
        // list A
        Node current1 = head1;
        // list B
        Node current2 = head2;
        int count  =0 ;
        while (current1 != null){
            while (current2 != null){
                if (current1.data == current2.data)
                    count++;
                current2 = current2.next;
            }
            current1 = current1.next;
//          initialize list B starting point
            current2 = head2;
        }
        return count;
    }
    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    // Utility function to print a linked list
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main (String[] args) {
        Node head1 = null;
        Node head2 = null;

        // Create following linked list
        // List A = 3 . 4 . 12 . 10 . 17

        head1 = push(head1, 17);
        head1 = push(head1, 10);
        head1 = push(head1, 12);
        head1 = push(head1, 4);
        head1 = push(head1, 3);

        // List B = 10 . 4 . 8 . 575 . 34 . 12
        head2 = push(head2, 12);
        head2 = push(head2, 34);
        head2 = push(head2, 575);
        head2 = push(head2, 8);
        head2 = push(head2, 4);
        head2 = push(head2, 10);

        // print list A
        System.out.print("Given Linked List A: \n");
        printList(head1);

        // print list B
        System.out.print("Given Linked List B: \n");
        printList(head2);

        int count = countCommonNodes(head1, head2);
        // print number of common node in both list
        System.out.print("Number of common node in both list is = " + count);
    }
}
