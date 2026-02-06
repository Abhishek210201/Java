import java.util.Scanner;

public class special_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int row =sc.nextInt();
        int a = row;  //no of stars to be printed in each line
        for(int i = 1; i<= row; i++) {
            for (int j = 1; j <= row + 1 - i; j++) {
                System.out.print("*");
            }
            a--;
            System.out.println();
        }
    }
}
