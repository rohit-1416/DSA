package PI.SearchSort;

public class FirstOccuranceArrayRecursion {
    static void printArr(int []arr, int size, int n){
        if (n == size)
            return ;
        else
            System.out.println(arr[n]);
            printArr(arr, size, ++n);
    }

    public static void main(String[] args) {
        printArr(new int []{3,4,5,3,0,7}, 5,0);
    }
}
