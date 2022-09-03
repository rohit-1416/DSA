package PI.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class SpanOfStocks {
    static void getSpan(int arr[],int size){
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        System.out.print( 1 + " ");
        for (int i = 0 ; i < arr.length; i++ ){
//            if element is not lessor than stack of new element then push else pop
            while (! stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }
            int span = stack.isEmpty() ? i+1 : i - stack.peek();
            System.out.print(span + "\t");
            stack.push(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,60,40,55,80,50,120};
        int size =arr.length;
        getSpan(arr,size);
    }

}
