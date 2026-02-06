import java.util.Scanner;

public class pattern_printing {
    public static void main(String[] args) {
//        for(int i=1;i<=3;i++){
//            for(int j=1;j<=3;j++){
//                System.out.println(i,j);
//            }
//        }

        //rectangular pattern print
//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//        int c =sc.nextInt();
//        for(int i=1;i<=r;i++){
//            for(int j=1;j<=c;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //rectangular a hollow pattern print
//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//        int c =sc.nextInt();
//        for(int i=1;i<=r;i++){
//            for(int j=1;j<=c;j++){
//                if(i==1||i==r||j==1||j==c){
//                    System.out.print("*");
//                }
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }

//      Triangle
//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//
//        for (int i=1;i<=r;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        inverted triangle     r+1-i
//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//        for (int i=1;i<=r;i++){
//            for(int j=1;j<=r+1-i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//                //or
//        for (int i=r;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Pyramid
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c =sc.nextInt();
        for (int i=1;i<=r;i++){ //traversing over rows

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
