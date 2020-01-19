public class Main {
    public static void main(String[] args) {
        String adedeji = "adedeji";
        permutation(adedeji);
    }


    public static void printUnorderedPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i);
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + array[i] + ", " + array[j] + ")");
            }
            System.out.println();
        }
    }

    static void permutation(String str) {
        permutation(str, "");

    }

    static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }
}

//}
//    int r = 3;
//    int[] s = new int[]{3, 2, 6};
//    int[] e = new int[]{5, 8, 9};
//    int x = lectureHallScheduling(3, s, e);
//        System.out.println(x);

//    public static int lectureHallScheduling(int input1, int[] input2, int[] input3) {
//        int i, last_finished, cnt;
//
//        Interval[] intervals = new Interval[input1];
//        for (i = 0; i < input1; i++) {
//            intervals[i] = new Interval();
//            intervals[i].start = input2[i];
//            intervals[i].finish = input3[i];
//        }
//        Arrays.sort(intervals, new Comparator<Interval>() {
//            @Override
//            public int compare(Interval x, Interval y) {
//                if (x.start == y.start)
//                    return x.start - y.start;
//                return x.finish - y.finish;
//            }
//
//        });
//
//        for (i = last_finished = cnt = 0; i < input1; i++) {
//            System.out.println(intervals[i].start);
//            System.out.println(intervals[i].finish);
//            if (intervals[i].start > last_finished) {
//                ++cnt;
//                last_finished = intervals[i].finish;
//            }
//        }
//        //output1 = cnt;
//
//        return cnt;
//
//        //throw new UnsupportedOperationException("lectureHallScheduling(int input1,int[] input2,int[] input3)");
//    }


