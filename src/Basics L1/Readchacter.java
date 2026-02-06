import java.util.Scanner;
public class Readchacter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);   //may be take char input using indexing
        System.out.println("Character is:"+ ch);


    }
}
