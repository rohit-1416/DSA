package PI.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreviousGraterOptimized {
    static void getPreviousGrater(int arr[]){
        Deque<Integer> stack = new ArrayDeque<>();
        stack.add(arr[0]);

        for (int i = 1 ; i < arr.length; i++ ){
            while (stack.isEmpty() == false && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty())
                System.out.println("- ");
            else
                System.out.println(stack.peek()+" ");
            stack.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[ ]= {30,50,20,15,25};
        getPreviousGrater(arr);
    }
}
