package PI.SearchSort;

public class LinearSearch {
    static  int LinearSearchElement(int arr [],int key){
        for(int i =0; i<arr.length; i++){
            if(arr[i]== key)
                return i;
//            else return -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(LinearSearchElement(new int[]{10,20,30,40,50},50));
    }
}
