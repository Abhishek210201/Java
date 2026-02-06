import java.util.Scanner;

public class Pattern_Printing {
    public static void main(String[] args) {
//        1 2 3 4
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a row:");
        // int row = sc.nextInt();
        // for(int i = 1; i<= row; i++){
        //     for(int j = 1; j<= row; j++){
        //         System.out.print(j+" ");
        //     }
        // System.out.println();

//      A B C D
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a no :");
        // int row = sc.nextInt();
        // for(int i = 1; i<= row; i++){
        //     for(int j = 1; j<= row; j++){
        //         System.out.print((char)(j+64)+" ");
        //     }
        // System.out.println();

        //abcd
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a no:");
        // int row = sc.nextInt();
        // for(int i = 1; i<= row; i++){
        //     for(int j = 1; j<= row; j++){
        //         System.out.print((char)(j+96)+" ");
        //     }
        // System.out.println();


        //111 \222 \333
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a no:");
        // int row = sc.nextInt();
        // for(int i = 1; i<= row; i++){
        //     for(int j = 1; j<= row; j++){
        //         System.out.print(i+" ");
        //     }
        // System.out.println();

        // AA \BB
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a no:");
        // int row =sc.nextInt();
        // for(int i = 1; i<= row; i++){
        //     for(int j = 1; j<= row; j++){
        //         System.out.print((char)(i+64)+" ");
        //     }
        //     System.out.println();


        //aBcD
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a no:");
//        int row =sc.nextInt();
//        for(int i = 1; i<= row; i++){
//            for(int j = 1; j<= row; j++){
//                if(i%2!=0){        //== AbCd
//                    System.out.print((char)(i+96)+" ");
//                }else{
//                    System.out.print((char)(i+64)+" ");
//                }
//            }
//            System.out.println();

//        triangle alphabets
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a no:");
//        int row = sc.nextInt();
//        for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print((char) (j + 64) + " ");
//            }
//            System.out.println();

        //mix alphabet and numbers hw
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a no:");
//        int row =sc.nextInt();
//        for(int i = 1; i<= row; i++){
//            for(int j = 1; j<= i; j++){
//                if(i%2!=0){
//                    System.out.print(j+" ");
//                }else{
//                    System.out.print((char)(j+64)+" ");
//                }
//            }
//            System.out.println();
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int row =sc.nextInt();
        for(int i = 1; i<= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i % 2 != 0) {        //== AbCd
                    System.out.print((char) (i + 96) + " ");
                } else {
                    System.out.print((char) (i + 64) + " ");
                }
            }
            System.out.println();
        }
    }
}