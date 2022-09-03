package PI.LinkedList;

public class LinkedListImplementation {
    Node head ;
    public void printData(){
       Node n = head;
       while (n!= null){
           System.out.println(n.data +" ");
           n= n.next;
       }
    }

    public static void main(String[] args) {
        LinkedListImplementation obj = new LinkedListImplementation();
        obj.head = new Node(10);
        Node FirstNode = new Node(20);
        Node SecondNode = new Node(30);
        Node ThirdNode = new Node(40);
//         obj.head         FirstNode           SecondNode
//             |                |                  |
//             |                |                  |
//        +----+------+     +----+------+     +----+------+
//        | 10  | null |     | 20  | null |     |  30 | null |
//        +----+------+     +----+------+     +----+------+

        obj.head.next=FirstNode;
        FirstNode.next=SecondNode;
        SecondNode.next =ThirdNode;
//        obj.head         FirstNode           SecondNode
//             |                |                  |
//             |                |                  |
//        +----+------+     +----+------+     +----+------+
//        | 10  | 1001 | -> | 20  | 5001 | ->  |  3 | null |
//        +----+------+     +----+------+     +----+------+
        obj.printData();

    }
}
