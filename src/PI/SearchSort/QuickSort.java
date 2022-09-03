package PI.SearchSort;
public class QuickSort {
    public static int partition(int arr[],int low,int high){
            int swapIndex = low - 1;
            int pivot = arr[high];

            for (int i = low ; i < high; i++) {
                if (arr[i] < pivot) {
//                increase swapIndex
                    swapIndex++;
//                swap i with swapIndex
                    int temp = arr[i];
                    arr[i] = swapIndex;
                    swapIndex = temp;
//                increase i
                }
            }
//            if i reaches end i == size
            int temp2 = arr[swapIndex+1];
            arr[swapIndex+1] = arr[high];
            arr[high] = temp2;

            return swapIndex+1;
        }

    public static void
    quickSortArr(int arr [], int low, int high){
        if(low < high ){
            int indexPI =  partition(arr,low,high); // partition index
            quickSortArr(arr,low,indexPI-1); // left partition
            quickSortArr(arr,indexPI+1,high); // right partition
        }
    }

    public static void main(String[] args) {
        int arr[] = {70,90,10,30,50,20,60};
        int low = 0 ;
        int n = arr.length;
        quickSortArr(arr,0,n-1);
        for (int i =0 ;i < arr.length ;i++ ){
            System.out.println(arr[i]+" ");
        }
    }
}

