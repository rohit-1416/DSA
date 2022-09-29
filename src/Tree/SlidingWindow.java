package Tree;//Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.
//
//        Input  : arr[] = {100, 200, 300, 400}, k = 2
//        Output : 700
//
//        Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4
//        Output : 39

//    arr = [ 5 , 2 , -1, 0 , 3 ] k =3
//      ADD 5 2 -1
//      delete 5 and add 0 for next frame
//
public class SlidingWindow {
    static int maxSum(int arr[] ,int k){
        int n = arr.length;
        if (k > n  ){
            System.out.println("Invalid");
            return 0;
        }
//        complete first window of size k
        int max_sum =0;
        for (int i = 0; i <k; i++){
            max_sum += arr[i];
        }
        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int window_sum = max_sum;
        for (int i = k ; i < n; i++){
//          add 0 and delete 5
            window_sum += arr[i] - arr[i-k];
            max_sum = Math.max(max_sum , window_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
            int k = 4 ;           //window size
        System.out.println(maxSum(new int []{ 1, 4, 2, 10, 2, 3, 1, 0, 20}, k)); // anonymous array

    }
}
