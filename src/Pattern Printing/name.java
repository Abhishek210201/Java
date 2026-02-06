import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "! It's nice to meet you.");
        System.out.println("Khana kha liya?");
        String food = sc.nextLine();
        System.out.println(food +"Bahut Bhadiya!!"+ userName );
        sc.close();
    }
}
