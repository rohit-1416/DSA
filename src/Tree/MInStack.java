package Tree;

public class MInStack {
    public final int MAX;
    int top ;
    int stack [];
    MInStack(int size){
        MAX = size;
        stack = new int[MAX];
        top = -1;
    }
    boolean push(int element){
        if(top == MAX){
            System.out.println("Overflow");
            return false;
        }else {
            top++;
            stack[top] = element;
            System.out.println("element pushed "+element);
        }
        return true;
    }
    int pop(){
        if(top == -1){
            System.out.println("underflow");
            return 0;
        }else {
            int x= stack[top];
            top--;
            System.out.println(" element poped "+x);
        return x;
        }
    }
    int peek(){
        int peek =  stack[top];
        System.out.println("peek is "+peek);
        return peek;
    }
    int min(){
        int min =stack[top];
        for(int i = top ;i >= 0 ;i--){
            if(stack[i]< min)
                min=stack[i];
        }
        System.out.println("min = "+ min);
        return min;
    }
    void printStack(){
        for(int i=top; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args) {
        MInStack stk = new MInStack(10);
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        stk.min();
        stk.peek();
        stk.printStack();
        stk.pop();
        stk.pop();
        stk.peek();
        stk.push(5);
        stk.printStack();
        stk.min();

    }
}
