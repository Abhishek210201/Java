import java.util.Scanner;

public class binary_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int row  =sc.nextInt();
//       for(int i = 1; i<= row; i++){
//           for(int j = 1; j<= i; j++){
//               if((i+j)%2==0){
//                   System.out.print(1+" ");
//               }else
//                   System.out.print(0+" ");
//           }
//           System.out.println();
//        }


        for(int i = 1; i<= row; i++){
            int a =1;
            for(int j = 1; j<=i; j++){
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }

        //1 13 135 1357....


    }
}
