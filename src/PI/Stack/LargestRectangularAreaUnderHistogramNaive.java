package PI.Stack;

public class LargestRectangularAreaUnderHistogramNaive {
    public static int getMaxArea(int arr [] , int n){
        int res  =0 ;

        for (int i =0 ; i< n ; i++){
            int count =1;
            for (int j = i-1 ; j >= 0 ;j--){
                if (arr[j] >= arr[i])
                    count++;
                else
                    break;
            }
            for (int j = i+1 ; j <arr.length ;j++){
                if (arr[j] >= arr[i])
                    count++;
                else
                    break;
            }
        int temp = count * arr[i];
            res = Math.max(res, temp);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr [] ={ 12, 3, 4, 4, 1, 5, 7 };
//        int size = arr.length;
        int n =7 ;
        System.out.println(getMaxArea(arr,n));

    }
}
