package PI.LinkedList;

public class DoublyLinkedListImplementation {
    dNode head,tail;

    public void traverseForward(){
        dNode temp = head;
        while (temp != null){
            System.out.print("-> "+temp.data+" ");
            temp=temp.next;
        }
    }
    public void traverseBackWord(){
        dNode temp = tail;
        while (temp != null){
            System.out.print(temp.data+" <- ");
            temp= temp.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedListImplementation obj = new DoublyLinkedListImplementation();
        obj.head =new dNode(10);
        dNode SecondNode = new dNode(20);
        dNode ThirdNode = new dNode(30);
        dNode FourthNode = new dNode(40);
        obj.tail=new dNode(50);

        obj.head.prev =null;
        obj.head.next= SecondNode;
        SecondNode.prev= obj.head;
        SecondNode.next = ThirdNode;
        ThirdNode.prev = SecondNode;
        ThirdNode.next=FourthNode;
        FourthNode.prev = ThirdNode;
        FourthNode.next = obj.tail;
        obj.tail.prev=FourthNode;
        obj.tail.next=null;

        obj.traverseForward();
        System.out.println();
        obj.traverseBackWord();
    }
}
