package PI.SearchSort;

class FactRecursion {
    static  int Factorial(int n){
        if (n > 1)
            return n * Factorial(n-1);
        else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }
}