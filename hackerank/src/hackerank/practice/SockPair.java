package hackerank.practice;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class SockPair {
    public static void main(String[] args) {
        int pairs = sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30,50, 10, 20});
        System.out.println(pairs);
    }

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        if (n == 0) return 0;
        if (n == 1) return 0;
        if (ar == null) return 0;
        if (ar.length < 2) return 0;
        HashMap<Integer, Integer> sockPair = new HashMap<Integer, Integer>();
        for (int s : ar) {
            int count = sockPair.get(s) == null ? 0 : sockPair.get(s);
            count = count + 1;
            sockPair.put(s, count);
        }

        // for each item of has map
        Iterator it = sockPair.entrySet().iterator();
        int sockPairCount = 0;
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();

            sockPairCount += ((Integer) pair.getValue()) / 2;
        }

        return sockPairCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] ar = new int[n];
//
//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }
//
//        int result = sockMerchant(n, ar);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
//    }
}
