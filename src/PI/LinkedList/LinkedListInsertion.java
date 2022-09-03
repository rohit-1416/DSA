package PI.LinkedList;

public class LinkedListInsertion {
    Node head ;
    public void printData(){
        Node n = head;
        while(n !=  null){
            System.out.print( n.data+" ");
            n= n.next;
        }
    }
    public void insertATBeginning(int toBeInsertedData)
    {
        Node toBeInserted = new Node(toBeInsertedData);
        toBeInserted.next=head;
        head= toBeInserted;
    }
    public void insertAtEnd(int toBeInsertedData){
        if (head == null) {
            head = new Node(toBeInsertedData);
            return;
        }
        Node toBeInserted = new Node(toBeInsertedData);
        Node n = head ;
        while (n.next != null){
            n= n.next;
        }
        n.next = toBeInserted;
        toBeInserted.next=null;
    }
    public void insertAfterGivenNode(Node givenNode, int toBeInsertedData){
        Node toBeInserted = new Node(toBeInsertedData);
        if(givenNode == null){
            System.out.println("Given node can't be null ");
            return;
        }
        Node n = head ;
        while (n.data != givenNode.data){
            n= n.next;
        }
        toBeInserted.next = givenNode.next;
        givenNode.next= toBeInserted;
    }
    public void insertAtIndex(int index, int toBeInsertedData){
        Node toBeInserted = new Node(toBeInsertedData);
        int count = 0 ;
        Node n = head;
        while (count <  index-1){
            n= n.next;
            count++;
        }
        toBeInserted.next= n.next;
        n.next=toBeInserted;

    }

    public static void main(String[] args) {
        LinkedListInsertion obj = new LinkedListInsertion();
        obj.head = new Node(10);
        Node FirstNode = new Node(20);
        Node SecondNode = new Node(30);
        Node ThirdNode = new Node(40);

        obj.head.next= FirstNode;
        FirstNode.next =SecondNode;
        SecondNode.next= ThirdNode;

        obj.insertATBeginning(5);
        obj.insertAfterGivenNode(obj.head.next.next, 25);
        obj.insertAtIndex(2,15);
        obj.insertAtEnd(50);
        obj.printData();


    }

}
