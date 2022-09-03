package PI.SearchSort;

public class BinarySearch {
    static int SearchElement(int arr[] , int key, int left,int right) {
//        base condition
        if (right >= left) {
//            calculate mid
            int mid = left + (right - left) / 2;
            if (arr[mid] == key)
                return mid;
//            recursive call
            if (arr[mid] > key) {
                SearchElement(arr, key,left,mid-1);
            }
            return SearchElement(arr, key,mid+1,right);
        }
        return -1;
    }
    public static void main(String[] args) {
        int dataArr [] = new int []{10,20,30,40,50,60} ;
        int left = 0;
        int right = dataArr.length-1;
        System.out.println(SearchElement(dataArr,50, left,right));
    }
}
