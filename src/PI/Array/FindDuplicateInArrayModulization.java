package PI.Array;
//Time   : O(N)
//space : O(1)
//cant handle 0 but can be done by either incrementing or decrementing
// all element in array by one
public class FindDuplicateInArrayModulization {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,1,2,5,8};
        int n = arr.length;
        for (int i =0 ; i < n; i++ ){
            arr[arr[i]%n] = arr[arr[i]%n]+n;
        }
        System.out.println("Repeating elements are ");
        for (int i =0 ; i< n; i++){
            if (arr[i] >= n *2 )
                System.out.print(arr[i]+" ");
        }
    }
}
