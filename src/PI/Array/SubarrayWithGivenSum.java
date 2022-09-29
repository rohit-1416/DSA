package PI.Array;

public class SubarrayWithGivenSum {
    static void findIndex(int arr[], int sum, int n) {
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
