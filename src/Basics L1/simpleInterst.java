import java.util.Scanner;

public class simpleInterst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal: ");
        float p =sc.nextFloat();

        System.out.println("Enter the rate: ");
        float r = sc.nextFloat();

        System.out.println("Enter the Time: ");
        float t= sc.nextFloat();

        float interest = (p*r*t)/100;

        System.out.println("Your interest is "+interest);



    }
}
