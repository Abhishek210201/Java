import java.util.Scanner;

public class horizontal_flipped_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int row  =sc.nextInt();
//       for(int i = 1; i<= row; i++){
//           for(int j = 1; j<= row+1-i; j++){
//               System.out.print("*");
//
//           }
//           System.out.println();
//        }

//        for(int i = 1; i<= row; i++) {   simple but not applicable
//            for (int j = 1; j >= i; j--) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }

//        int a = row;  //no of stars to be printed in each line
//        for(int i = 1; i<= row; i++) {
//            for (int j = 1; j <= row + 1 - i; j++) {
//                System.out.print("*");
//            }
//            a--;
//            System.out.println();
        // }

//        for(int i = 1; i<= row; i++) {   //reverse of number
//            for (int j = row; j >=i; j--) {
//                System.out.print(j + " ");
//
//            }
//            System.out.println();
//        }

//        for(int i = 1; i<= row; i++) {   //triangle of number
//            for (int j = 1; j <= row + 1 - i; j++) {
//                System.out.print(j + " ");
//
//            }
//            System.out.println();
//        }

    //    for(int i = 1; i <= row; i++) {   //triangle of alphabet
    //        for (int j = 1; j <= row + 1 - i; j++) {
    //            System.out.print((char)(i+64) + " ");
    //        }
    //        System.out.println();
    //     }

//         for(int i = 1; i<= row; i++) {   //triangle of alphabet small
//             for (int j = 1; j <= row + 1 - i; j++) {
//                 System.out.print((char)(j+96) + " ");
//             }
//             System.out.println();
//         }

        //vertical flipped triangle
//        for(int i=1;i<=row;i++){
//            for (int j=1;j<=row;j++){
//                if(i+j<=row){
//                    System.out.print("  ");
//                }else{
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }

        // M- II Vertical flipped  triangle
//        for(int i=1;i<=row;i++){
//            for (int j=1;j<=row-i;j++){
//                System.out.print("  ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //Vertical flipped number triangle
//        for(int i=1;i<=row;i++){
//            for (int j=1;j<=row-i;j++){
//                System.out.print("  ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //vertical flipped alphabet triangle
//        for (int i=1;i<=row;i++){
//            for(int j=1;j<=row-i;j++){
//                System.out.print("# ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print((char)(i+64)+" ");
//            }
//            System.out.println();
//        }

        //rhombus
//        for(int i=1;i<=row;i++){
//            for (int j=1;j<=row-i;j++){
//                System.out.print("  ");
//            }
//            for (int j=1;j<=row;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // triangle upper matrix form
//        for (int i=1;i<=row;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=row-i+1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //pyramid
//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=row-i;j++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // nsp m -II
//        nsp=n-1 // no of spaces    ---> nsp--
//        nst =1  // no of star      ---> nst+=2
//
//        int nsp=row-1,nst=1;
//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=nsp;j++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=nst;j++){
//                System.out.print("* ");
//            }
//            nsp--;
//            nst+=2;
//            System.out.println();
//        }

        //Diamond
//        for(int i=1;i<=row;i++){     //incompleted code
//            for(int j=1;j<=row-i;j++){
//                System.out.print("# ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=row;i++){
//            for(int k=1;k<=i;k++){
//                System.out.print("# ");
//            }
//            for(int k=1;k<=row-i+1;k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //M-II
//        int nsp=row-1,nst=1;
//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=nsp;j++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=nst;j++){
//                System.out.print("* ");
//            }
//            nsp--;
//            nst+=2;
//            System.out.println();
//        }
//        nsp=1;
//        nst=2*row-3;
//        for(int i=1;i<=row-1;i++) {
//            for (int j = 1; j <= nsp; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= nst; j++) {
//                System.out.print("* ");
//            }
//            nsp++;
//            nst -= 2;
//            System.out.println();
//        }

        //Bridge
//        for(int j=1;j<=row*2-1;j++){
//            System.out.print("* ");
//        }
//        System.out.println();
//        int nsp =1;
//        for(int i=1;i<=row-1;i++){
//            for(int j=1;j<=row-i;j++){
//                System.out.print("* ");
//            }
//            for(int j=1;j<=nsp;j++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=row-i;j++){
//                System.out.print("* ");
//            }
//            nsp+=2;
//            System.out.println();
//        }








    }
}

