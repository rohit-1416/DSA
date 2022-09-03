package Tree;

import java.util.*;
public class Test {
//    static int Reverse(int element){
//        int temvar = element;
//        int reverse =0 ;
//        while (temvar > 0 ){
//            reverse = reverse * 10 + temvar%10;
//            temvar /= 10;
//        }
//        System.out.println(reverse);
//        return reverse;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        sc.close();
//        Test t = new Test();
//        System.out.println(t.Reverse(a));
//    }

    static void Revese(int element){
        if(element > 10 ){
            System.out.println(element+ " k");
            return ;
        }
        else {
            System.out.println( element % 10 );
            Revese( element / 10 );
        }
    }
    public static void main(String[] args) {
        int num = 1099;
        System.out.print("Reversed Number: ");
        Revese(num);
    }
}
