package PI.Stack;

public class PreviousGraterNaive {
    static void getPreviousGrater(int arr[] , int size){
        boolean flag =false;
        for (int i = 0 ; i <  size ; i++ ){
            for (int j = i-1; j >= 0 ;j--){
                if(arr[j] > arr[i]){
                    System.out.println(arr[j]);
                    flag =true;
                    break;
                }
            }
        }
        if(flag == false) {
            System.out.println("- ");
        }
    }

    public static void main(String[] args) {
        int arr [] = {12,10,20,22,15,14,18,32,20,22,19};
        int size = arr.length;
        getPreviousGrater(arr,size);
    }
}
