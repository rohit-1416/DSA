package PI.SearchSort;

public class BubbleSort {

void bubbleSort(int arr[]){
    int n = arr.length;
    for (int i = 0; i < n - 1; i++)
        for (int j = 0; j < n - i - 1; j++)
            if (arr[j] > arr[j + 1]) {
                // swap arr[j+1] and arr[j]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
    }
     void printArray(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("Sorted Array :- "+ arr[i]+ " ");
        }
         System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {28,6,4,2,24};

        System.out.println("before sort ");
        ob.printArray(arr);
        ob.bubbleSort(arr);
        System.out.println("after sort ");
        ob.printArray(arr);
    }
}
