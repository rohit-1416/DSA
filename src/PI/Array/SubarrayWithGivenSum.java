package PI.Array;

public class SubarrayWithGivenSum {
    static void findIndex(int arr[], int sum, int n) {
//        int currentSum = arr[0], start = 0, i;
//        // Pick a starting point
//        for (i = 1; i < n; i++) {
//            // If currentSum exceeds the sum,
//            // then remove the starting elements
//            while (currentSum > sum && start < i - 1) {
//                currentSum = currentSum - arr[start];
//                start++;
//            }
//            // If currentSum becomes equal to sum,
//            // then return true
//            if (currentSum == sum) {
//                int p = i - 1;
//                System.out.println("Sum found between indexes " + start + "and " + p);
//                return 1;
//            }
//            // Add this element to curr_sum
//            if (i < n)
//                currentSum = currentSum + arr[i];
//        }
//        System.out.println("No subarray found");
//        return 0;

        int start = 0, currentSum = arr[0],i;
        // Pick a starting point
        for (i = 1; i < n; i++) {
//         incrementing currentSum
            if (i < n )
                currentSum += arr[i];
//              If currentSum exceeds the sum,
//              then remove the starting elements
            while (currentSum > sum && start < i  ) {
                currentSum -= arr[start];
                start++;
            }
            if (currentSum == sum) {
                int end = i;
                System.out.println("found between " + start + " and " + end);
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,4,20,3,10,5};
        int sum = 18;
        int n = arr.length;
        findIndex(arr,sum,n);
    }
}
