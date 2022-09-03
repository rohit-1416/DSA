package PI.LinkedList;

public class LinkedListDeletion {
    Node head ;
    public void printData(){
        Node temp =head;
        while (temp != null){
            System.out.print(temp.data+ " ");
            temp =temp.next;
        }
    }
    Node deleteAtEnd(){
        Node temp = head;
//        stays 1 iteration behind null 1   2   3   4
//                                              ^
        while (temp.next.next != null){
            temp= temp.next;
        }
        temp.next=null;
        return temp;
    }
    Node deleteAtBeginning(){
        Node temp  =head;
        head = head.next;
        temp.next =null;
        return head;
    }
    Node deleteAtIndex(int index){
        int count = 0 ;
        Node temp = head;
        while (count <index-1){
            temp = temp.next;
            count++;
        }
        Node temp2 = temp.next;
        temp.next=temp.next.next;
        temp2.next=null;
        return temp2;
    }
    public static void main(String[] args) {
        LinkedListDeletion obj = new LinkedListDeletion();
        obj.head = new Node(10);
        Node FirstNode = new Node(20);
        Node SecondNode = new Node(30);
        Node ThirdNode = new Node(40);

        obj.head.next= FirstNode;
        FirstNode.next =SecondNode;
        SecondNode.next= ThirdNode;

//        obj.printData();
//        System.out.println();
//        System.out.println("Deleted at Beginning "+obj.deleteAtBeginning());
//        System.out.println("Deleted at End "+obj.deleteAtEnd());
        System.out.println("Deleted at index 2 "+obj.deleteAtIndex(2));
        obj.printData();
    }
}
