package PI.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicatesInArray {
    static ArrayList findDuplicates(int arr[], int n){
        Arrays.sort(arr);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0 ; i< n-1; i++){
            if (arr[i] == arr[i+1] )
                arrayList.add(arr[i]);
        }
        return arrayList;
    }
    public static void main(String[] args) {
        int arr[] = { 0,1,2,3,4,5,6,0,1,2,3,6,8,11};
        int n =arr.length;
        System.out.println(findDuplicates(arr,n));
    }
}

