package PI.SearchSort;

import java.util.Map;
import java.util.TreeMap;

public class MergeSortedOptmized {
    static void merge(int nums1[], int n , int nums2[], int m){

        Map<Integer, Boolean> mp = new TreeMap<Integer,Boolean>();

        for (int i = 0 ; i < n ; i++)
            mp.put(nums1[i],true);

        for (int j =0 ; j < m ; j++)
            mp.put(nums2[j],true);

        for (Map.Entry<Integer,Boolean> mp2 : mp.entrySet())
            System.out.print(mp2.getKey()+" ");
    }
    public static void main(String[] args) {
        int nums1 [] = {2,5,4,7,};
        int nums2[] = {3,4,5,8,9,11,12};
        int n = nums1.length;
        int m = nums2.length ;
        merge (nums1,n,nums2,m);
    }
}
