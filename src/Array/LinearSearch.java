package Array;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the element in the Array: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter The element i Array:");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the Searching Element");
        int y= sc.nextInt();

        boolean flag =false; // it means target array mein nahi hai

        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==y) {
//                System.out.println("The element is Present in the index at. "+ arr[i]);
                flag =true; // target array mein hain
                break;
            }

        }
        if (flag){
            System.out.println("The element is Present. ");
        }
        else{
            System.out.println("The element is Missing. ");
        }
    }
}
