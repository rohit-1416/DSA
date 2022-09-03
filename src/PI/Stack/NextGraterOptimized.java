package PI.Stack;

import java.util.*;

public class NextGraterOptimized {
    public static ArrayList<String> findNextGrater(int arr[], int size ){
        ArrayList<String> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        s.add(arr[size - 1]);
        list.add("-");

        for (int i = size - 2; i >= 0; i--)
        {
            while (!s.isEmpty() && s.peek() <= arr[i])
                s.pop();
            String res = s.isEmpty() ? "-" : Integer.toString(s.peek());

            list.add(res);
            s.add(arr[i]);
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {30, 50, 20, 15, 25};
        int size = arr.length;
        for (String x : findNextGrater(arr, size))
        {
            System.out.print(x + " ");
        }

    }
}
