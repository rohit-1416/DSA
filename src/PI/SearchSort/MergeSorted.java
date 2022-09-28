package PI.SearchSort;
public class MergeSorted {
//    Time Complexity : O(n1 + n2)
//    Auxiliary Space : O(n1 + n2)
    static void merge(int nums1[], int n, int nums2[], int m) {
        int c [] = new int [n+m];
        int i = 0 , j= 0, k= 0;
        while (i < n && j < m){
            if (nums1[i] < nums2[j])
                c[k++] = nums1[i++];
            else
                c[k++] = nums2[j++];
        }
//        storing extra value
        while (i < n) c[k++] = nums1[i++];
        while (j < m) c[k++] = nums2[j++];

        for (int x =0 ; x < c.length; x++){
            System.out.print(c[x]+" ");
        }
    }

    public static void main(String[] args) {
        int nums1[] = {2, 4, 6, 8};
        int nums2[] = {5, 6, 7, 8, 9, 11, 20};
        int n = nums1.length;
        int m = nums2.length;
        merge(nums1, n, nums2, m);
    }
}