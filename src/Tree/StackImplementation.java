package Tree;

public class StackImplementation {
//    defiation of stack
    static final int MAX = 100 ;
    int top ;
    int stack[] ;
    StackImplementation(){
//        constructing topp
        stack =  new int[MAX];
        top = -1;
    }
//    boolean isEmpty(){
////        if(top == -1)
////            return true;
////        else
////            return false;
//        return (top < 0);
//    }
    boolean push(int element ){
        if(top < MAX) {
            stack[++top] = element;
//            top++;
            return true;
        }else {
            System.out.println("OverFlow");
            return false;
        }
    }

//   boolean push(int elament){
//        if(top== MAX){
//            System.out.println("OverFlow");
//            return false;
//        }
//        else {
//            stack[++top] = elament;
//            System.out.println(elament+" Pushed");
//            return true;
//        }
//   }
//    boolean push (int element){
//        if(top >= MAX-1){
//            System.out.println("Overfllow");
//            return false;
//        }
//        else {
//            stack[++top] = element;
////        assigning element to top and incrementing top
//            System.out.println("Element pushed "+ element);
//            return true;
//        }
//    }
    int pop(){
        if( top < 0 ){
            System.out.println("Underflow");
            return 0;
        }else {
            int x= stack[top--];
            System.out.println(x + " poped");
            return x;
        }
    }
//    int pop(){
//        if(top < 0){
//            System.out.println("underflow");
//            return 0;
//        }else {
//            int element= stack[top--];
//            System.out.println(element+ "poped");
//            return element;
//        }
//    }

//    int peek(){
//        if( top == -1 ){
//            System.out.println("Underflow");
//            return 0;
//        }
//        else {
//            int peek = stack[top];
//            System.out.println(peek +" is peek");
//            return peek;
//        }
//    }

    int peek(){
        if (top == -1){
            System.out.println("Underflow");
            return 0;
        }else {
            int peek= stack[top];
            System.out.println(peek+"is peek ");
            return peek;
        }
    }
//    void printStack(){
//        for(int i = top ; i > -1 ;i--){
//            System.out.println(" "+stack[i]);
//        }
//    }
    void printStack(){
        for (int i = top; i > -1; i--){
            System.out.println(" "+stack[i]);
        }
    }

    public static void main(String[] args) {
        StackImplementation obj = new StackImplementation();
        obj .push( 10 );
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60);
        obj.printStack();
        obj.peek();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.peek();
        obj.printStack();

    }

}
