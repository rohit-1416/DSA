package PI.LinkedList;

import java.util.Vector;

public class CountingCommonElementsInTwoLinkedListOptimized {
    static class Node{
        int data;
        Node next ;
    }
    static int countCommonNodes(Node head1, Node head2){
        // list  A
        Node current1 = head1;

        // list B
        Node current2 = head2;

        // set count  = 0
        int count = 0;

        Vector<Integer> map =new Vector<>();
        while(current1 != null){
            map.add(current1.data);
            current1=current1.next;
        }
        while (current2!= null ){
            if (map.contains(current2.data))
                count++;
            current2 = current2.next;
        }
        return count;
    }
    static Node push(Node head_ref, int data){
        Node newNode= new Node();
        newNode.data = data;
        newNode.next= head_ref;
        head_ref= newNode;

        return head_ref;
    }
    static void printList(Node head){
        while (head != null){
            System.out.println(head.data);
            head =head.next;
        }
    }

    public static void main(String[] args) {
        Node head1 = null;
        Node head2 = null;

        head1 = push(head1, 17);
        head1 = push(head1, 10);
        head1 = push(head1, 12);
        head1 = push(head1, 4);
        head1 = push(head1, 3);

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

        // call function for count common node
        int count = countCommonNodes(head1, head2);

        // print number of common node in both list
        System.out.print("Number of common node in both list is = " + count);

    }
}
