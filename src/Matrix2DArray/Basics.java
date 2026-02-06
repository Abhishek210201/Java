package Matrix2DArray;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
//        for (int i = 0; i <arr.length; i++) {
//            for (int j = 0; j <arr[0].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(arr.length+" "+arr[0].length);

        //2D Matrix
//        int[][] arr1= {{1,2,3},{4,5,6},{7,8,0}};
//        for (int i = 0; i <arr1.length; i++) {
//            for (int j = 0; j <arr1[0].length; j++) {
//                System.out.print(arr1[i][j]+" ");
//            }
//            System.out.println();
//        }

        //Input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}
