public class SpiralCopy {
    static int[] spiralCopy(int[][] inputMatrix){
// initialize
        int result[] = new int[inputMatrix.length * inputMatrix[0].length];
        int toprow=0;
        int leftcol=0;
        int bottomrow =inputMatrix.length;
        int rightcol= inputMatrix[0].length;
        int j = 0;
        while(j < result.length){
            // copy top row
            for(int col = 0; col < leftcol; col++){
                result[j++] = inputMatrix[toprow][col];
            }
            // toprow moves to next
            toprow++;

            // copy right col
            for(int row = toprow; row < bottomrow; row++){
                result[j++] = inputMatrix[row][rightcol];
            }
            // right col moves inward
            rightcol--;


            // copy bottom col
            for(int col = rightcol; col > leftcol; col--){
                result[j++] = inputMatrix[bottomrow][col];
            }
            // bottom moves inward
            bottomrow--;

            // copy left col
            for(int row = bottomrow+1; row > toprow; row--){
                result[j++] = inputMatrix[row][leftcol];
            }
            // left col shifts inward
            leftcol++;

        }

        return result;


    }

    public static void main(String[] args) {
        int[][] inputMatrix = {{1, 2, 3, 4, 5},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {6, 7, 8, 9, 10}};
        System.out.println(spiralCopy(inputMatrix));

    }


}
