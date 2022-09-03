package PI.SearchSort;

public class PowerOfNoRecursion {
    int DisplayPower(int x , int n){
        if (n != 0)
            return x * DisplayPower(x , n-1);
        else
            return 1;
    }

    public static void main(String[] args) {
        PowerOfNoRecursion obj = new PowerOfNoRecursion();
        System.out.println(obj.DisplayPower(2,5));
    }
}
