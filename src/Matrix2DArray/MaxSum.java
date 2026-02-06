package Matrix2DArray;

public class MaxSum {
    public static void main(String[] args) {
        int[][] arr1= {{1,2,3},{4,5,6},{7,8,9}};
        int maxsum=Integer.MIN_VALUE;
        int row =-1;
        for(int i = 0; i < arr1.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr1[0].length; j++) {
                sum += arr1[i][j];
            }
            if (sum > maxsum) {
                maxsum = sum;
                row=i;
            }

        }
        System.out.println(row+" "+maxsum);
    }
}
