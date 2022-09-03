package PI.SearchSort;

import java.util.ArrayList;
import java.util.Scanner;

//find the prime no from array and sum it
public class PrimeNo {
//    ArrayList <Integer> arrayList = new ArrayList<>();
    public static boolean primeCheck(int n){

            if (n <= 1)
                return false;
            if( n == 2)
                return true;
            if(n % 2 == 0)
                return false;
//            most imp
            for(int j = 3 ; j <= Math.sqrt(n) ; j += 2 ){
                if(n % j == 0 )
                    return false;
            }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        // Ask user to enter lower value of interval
//        System.out.print("Enter lower bound of the interval: ");
//        int lower = sc.nextInt(); // Take input
//
//        // Ask user to enter upper value of interval
//        System.out.print("\nEnter upper bound of the interval: ");
//        int upper = sc.nextInt(); // Take input
//
//        // Print display message
//        System.out.printf("\nPrime numbers between %d and %d are: ", lower, upper);
//
//        for (int i = lower; i <= upper; i++) {
//            if (primeCheck(i)) {
//                System.out.print(i + " ");
//            }
//        }
//        sc.close();

//        int arr [] = {2,5,7,9,13,14,20,25};
//        6 digit highest prime no
        for (int i = 999999 ; i >= 999599; i-- ){
            if(primeCheck(i)){
                System.out.print(i+ "\t");
                break;
            }
        }

    }

}
