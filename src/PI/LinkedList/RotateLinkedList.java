package PI.LinkedList;

public class RotateLinkedList {
    Node head ;
    void push (int data){
        Node newNode = new Node(data);
        newNode.next = head ;
        head = newNode ;
    }
    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ "\t");
            temp = temp.next;
        }
        System.out.println();
    }
//
    void rotate(int data){
        int count  =1 ;
        Node current =head ;
        while (count < data){
            current =current.next ;
            count++;
        }
        Node kThNode = current;
        while (current.next != null )
            current =current.next ;
        current.next =head;
        head =kThNode.next ;
        kThNode.next = null ;

    }
    public static void main(String[] args) {
        RotateLinkedList obj = new RotateLinkedList();
//        create 10->20->...->60
        for (int i = 60 ;  i >= 10 ; i-= 10)
            obj.push(i);
        System.out.println("Given List");
        obj.printList();
        System.out.println("After Rotation");
        obj.rotate(2);
        obj.printList();
    }
}
