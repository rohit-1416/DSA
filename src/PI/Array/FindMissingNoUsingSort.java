package PI.Array;

import java.util.Arrays;

public class FindMissingNoUsingSort {
    static int findMissing(int arr [] , int n ){
        Arrays.sort(arr);
        int start = arr[0];
        for (int i =1 ; i< n; i++){
            if (++start == arr[i+1])
                continue;
            else
                return start+1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,7,6,8};
        int n= arr.length;
        System.out.println(findMissing(arr,n));
    }
}
