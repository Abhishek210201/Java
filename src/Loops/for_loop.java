import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

//        for(int i=1;i<=n;i++){
//            System.out.println(i);
//        }

//        Sum of natural no
//        int sum=0;
//        for(int i=1;i<=n;i++){
//            sum =sum+i;
//        }
//        System.out.println(sum);

//      reverse order printing of number
        for(int num=n;num>=1;num--){    //for gap of two num+=2
            System.out.println(num);

        }


    }
}
