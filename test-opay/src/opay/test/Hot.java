package opay.test;

public class Hot {
    public static void main(String[] args) {
        int n = 8, k = 0;

        int count=0;
        while (n>1)
        {
            if (n%2==0&&k>0)
            {
                n=n/2;
                count++;
                k--;
            }
            else
            {
                n=n-1;
                count++;
            }
        }
        System.out.println(count);
    }
}
