package PI.SearchSort;

public class FiboRecursion {
    static  int Fibo (int n){
        if (n <= 1 ) {
           return n ;
        }
        else
        {
//            System.out.println( Fibo(n-1) + Fibo(n - 2));
            return Fibo(n-1) + Fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(Fibo(2));
    }
}
