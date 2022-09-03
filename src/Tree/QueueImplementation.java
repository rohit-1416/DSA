package Tree;

public class QueueImplementation {
    int size = 6;
    int items[]=new int [size];
    int front;
    int rear ;

    QueueImplementation(){
        front = -1;
        rear= -1;
    }
    boolean isFull(){
        if(front == 0 && rear == size-1)
        {
            return true;
        }
            return false;
    }

    boolean isEmpty(){
        if(front == -1){
            return true;
        }
        return false;
    }
    void enqueue(int item){
        if(!isFull()){
            if (front == -1)
                front= 0 ;
            rear++;
            items[rear]=item;

        }else {
            System.out.println("Overflow");
        }
    }
    void dequeue(){
//        int data =0;
        if(!isEmpty()){
            int data = items[front];
            if(front >= rear){
                front=-1;
                rear =-1;
            }
            else {
                front++;
            }
            System.out.println(data+ "is Deleted");
        }

    }
    void display()
    {
        int i;
        if(isEmpty())
        {
            System.out.println("PI.Queue is empty");
        }
        else
        {
            for(i=front;i<= rear;i++)
            {
                System.out.print(items[i]+" ");
            }

        }
    }


    public static void main(String[] args) {
QueueImplementation q =new QueueImplementation();
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

    }

}
