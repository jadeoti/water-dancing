public class IntegerDiv {
    public static void main(String[] args) {
        System.out.println(integerDivision(9, 2));
    }

    static int integerDivision(int a, int b){
        int count = 0;
        int sum = b;
        while (sum <= a){
            sum = sum +b;
            count++;
            System.out.println(count +" " + sum + " ");

        }

        return count;
    }
}
