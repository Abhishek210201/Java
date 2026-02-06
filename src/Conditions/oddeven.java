import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1 =sc.nextInt();
//        if (num1%2==0){
//            System.out.println("The number is Even");
//        }else{
//            System.out.println("The number is Odd");
//        }


        String ans;
        ans =(num1%2==0) ? "Even":"Odd";   //ternary operator
        System.out.println(ans);
    }
}
