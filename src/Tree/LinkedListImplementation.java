package Tree;

public class LinkedListImplementation {
//    Node head;
//    static class Node{
//        int value;
//        Node next;
//        Node(int d){
//            value = d;
//            next =null;
//        }
//    }
//
//    public static void main(String[] args) {
//        LinkedListImplementation l =new LinkedListImplementation();
//        l.head= new Node(10);
//        Node second = new Node(20);
//        Node third =new Node(30);
//
//        l.head.next =second;
//        second.next= third;
//        third.next=null;
//        while (l.head!= null){
//            System.out.println(l.head.value);
//            l.head=l.head.next;
//        }
//    }
//    stack implementation using LinkedList
    Node head;
    Node  top;
    LinkedListImplementation(){
        this.top = null ;
    }
    static class Node{
        int data;
        Node next ;
        Node(int val){
            data =val ;
            next =null;
        }
    }
    void pushStk (int element){
       Node temp =  new Node(element);
        if(temp == null)
        {
            System.out.println("Overflow");
        }
//            temp.data = element;
        temp.next = top ;
        top =temp;
        System.out.println(top.data+ " pushed");
    }
    public boolean isEmpty(){
        return top == null;
    }
    public int peek(){
        if(!isEmpty()) {
            System.out.println(top.data+" peek");
            return top.data;
        }
        else {
            System.out.println("Empty Stack ");
            return -1;
        }
    }
    public void pop(){
        if(top == null){
            System.out.println("Underflow");
            return;
        }else {
            System.out.println("poped");
            top= (top).next;
        }
    }
    void display(){
        if(top == null ){
            System.out.println("Empty Stack");
            System.exit(1);
        }else {
            Node temp = top;
            while (temp!= null){
                System.out.println(temp.data+" data");
                temp=temp.next;
            }
        }
    }
public static void main(String[] args) {
        LinkedListImplementation l = new LinkedListImplementation();
//        l.head = new Node(5);
//        Node second = new Node(20);
//        Node third = new Node(30);
//        l.head.next = second;
//        second.next =third;
        l.pushStk(50);
        l.peek();
        l.pushStk(60);
        l.pushStk(70);
        l.pushStk(80);
        l.pushStk(90);
        l.peek();
        l.display();
        l.pop();
        l.pop();
        l.pop();
        l.display();
        l.peek();

    }
}
