package Array;
import java.util.Arrays;

public class oddX2ANDevenX10 {
    public static void main(String[] args) {
        int[] arr={5,10,15,20,25,30};
        print(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) {arr[i]*=2;}
            else {
                arr[i]*=10;
            }

        }
        print(arr);
    }

    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
