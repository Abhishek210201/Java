import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Integer
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//        System.out.println("You enter a number is " + num);

        //String
        System.out.println("Enter your name ");
        String name = sc.nextLine(); // for entire sentence input
//      String name1 = sc.next();     // for single word input
        System.out.println("Hello "+name + " !!");


    }
}
