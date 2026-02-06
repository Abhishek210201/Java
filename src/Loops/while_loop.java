import java.util.Scanner;
public class while_loop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n =sc.nextInt();

        int num=1;
        while(num<=n){
            System.out.println(num);
            num++;
        }
    }
}
