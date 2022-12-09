package PI.Array;
//using Formula
//sum of n natural numbers: N*(N+1) / 2 ;
//Time : O(n)
//space : O(1)

public class FindMissingNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,7,6,8};
        int n= arr.length;

        int sum = (n+1)*(n+2)/2;
//        subtract each element from sum
        for (int i = 0 ; i<n ;i++){
            sum -= arr[i];
        }
        System.out.println(sum);
    }
}
