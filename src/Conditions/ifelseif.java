import java.util.Scanner;
public class ifelseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int x =sc.nextInt();

        if(x<=12){
            System.out.println("You are child");
        }else if(x>12 && x<18) {
            System.out.println("You are a teenager");
        }else if(x>18){
            System.out.println("You are adult");
        }

    }
}
