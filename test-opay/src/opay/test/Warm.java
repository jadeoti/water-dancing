package opay.test;

public class Warm {
    public static void main(String[] args) {

    }

    public int solution(String S) {
        // write your code in Java SE 8
        int decimalValue = Integer.parseInt(S, 2);

        return 0;
    }

    public int decompose(int number){

        if(number == 0){
            return 0;
        }else {
            if(number % 2 == 1){
                number = number -1;
            }
            if(number % 2 == 0){
                number = number / 2;
            }
            return decompose(number) +1;
        }



    }


}
