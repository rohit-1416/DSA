package Tree;

public class SinglyLinklistInsertion {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next= null;
        }
    }
    public Node insertBegning(int data){
        Node newNode= new Node(data);
        newNode.next =head;
        head =newNode;
        return head;
    }

//    public Node
    public void insertLast(int data){
        Node newNode =new Node(data);
        if(head == null){
            head=newNode;
            return ;
        }
        Node temp = head;
        while(temp.next!= null){
            temp= temp.next;
        }
        temp.next= newNode;
    }

    public static void main(String[] args) {
        SinglyLinklistInsertion s = new SinglyLinklistInsertion();
        s.head = new Node(10);
        Node second = new Node(20);
        Node newNode= new Node(40);
        Node third = new Node(30);

        s.insertBegning(5);
        s.head.next=second;
        second.next = newNode;
        newNode.next=third;
        s.insertBegning(2);
        s.insertLast(40);
        s.insertLast(50);
        while (s.head != null){
            System.out.println(s.head.data);
            s.head =s.head.next;
        }
    }
}
