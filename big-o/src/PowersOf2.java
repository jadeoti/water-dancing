public class PowersOf2 {
    public static void main(String[] args) {
        powersOf2(50);
        for(int i = 1; i < 50; i = i*2)
            System.out.println(i);
    }

    static int powersOf2(int n){
        if (n < 1){
            return 0;
        }
        if( n == 1 ){
            System.out.println(1);
            return 1;
        }else {
            int previous = powersOf2(n/2);
            int current = previous * 2;
            System.out.println(current);
            return current;
        }

    }


}
