package PI.SearchSort;
public class MergeSorted {
//Merge 2 sorted array

    public static void Merge(int a[], int b[], int n ,int m){
        int c [] = new int[n+m];
        int i = 0 , j = 0 , k = 0 ;

        while (i < n && j < m ){
            if(a[i] < b [j]) {
                c[k++] = a[i++];
            }
            else {
                c[k++] = b[j++];
            }
        }
        // Store remaining elements of second array
        while (i < n)
            c[k++] = a[i++];

        while (j < m)
            c[k++] = b[j++];
// print elements

        for (int x =0 ; x <= c.length-1 ; x++){
            System.out.print(c[x] + "  \t");
        }
    }

    public static void main(String[] args) {
        int a[] = {2,7,14,19};
        int n = a.length;
        int b[] = {6,9,11,16,25};
        int m = b.length;

        Merge(a,b,n,m);

    }
}
