package TCS;

public class SmallestMultiple {
    static String getMultiple(int a){
    String result =" Not Possible" ;
    if(a < 9){
        a+=10;
        return ""+a;
    }
//    works only for 2 digit
        for(int i = 2 ; i < a/2 &&  i< 9; i++ ){
            for (int j = a/2 ; j >= i; j--){
                if((i*j)== a)
                    result = i +""+ j;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getMultiple(10));
    }
}
