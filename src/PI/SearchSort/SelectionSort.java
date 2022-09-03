package PI.SearchSort;

public class SelectionSort {
    public void SelectionSortArr(int arr[]){
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public void PrintArray(int arr[]){
        for (int i=0 ;i < arr.length; i++){
            System.out.println("Sorted Array = "+arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={75,16,80,10,18,6};
        SelectionSort obj = new SelectionSort();
        obj.SelectionSortArr(arr);
        obj.PrintArray(arr);
    }
}
