package PI.Queue;

public class QueueOperations {
    int front, rear, size;
    int MyQueue[] ;
    QueueOperations(int capacity){
         front =-1;
         rear = -1;
         size =capacity;
         MyQueue = new int[size];
    }
    boolean isFull(){
        if ( front == 0 &&rear == size-1)
            return true;
        return false;
    }
    boolean isEmpty(){
        if (front == -1)
            return true;
        return false;
    }
    void enqueue(int element){
       if (isEmpty()) {
           front = 0;
       }
       if(isFull())
           System.out.println("Queue is full ");
       MyQueue[++rear] = element;
        System.out.println(element +" is inserted");
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty ");
            return 0 ;
        }
        int data = MyQueue[front];
        if( front >=  rear){
            front = -1;
            rear = -1;
        }
        front++;
        System.out.println(data + "is deleted");
        return data;
    }
    void display() {
        if (isEmpty()) {
            System.out.println("PI.Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(" "+MyQueue[i] + "");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
     QueueOperations q= new QueueOperations(10);
        q.dequeue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        q.dequeue();
        q.display();
//        q.enqueue(60);
    }
}
