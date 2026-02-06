import java.util.Scanner;

public class sum_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int sum= 0;
        int num = 1;
        while (num <= n) {
            sum =sum+num;
            num++;
        }
        System.out.println("The sum of natural number are: "+sum);
    }
}