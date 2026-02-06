package Array;
import java.util.Arrays;
public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40};
        int[] x= arr; //x is shallow copy of arr
        x[0]=1000;
        System.out.println(arr[0]);

//        int[] y =Arrays.copyOf(arr,arr.length);  //deep copy
//        y[0] = 100;
//        System.out.println(arr[0]);
//        System.out.println(y[0]);

        int[] arr1 ={10,20,30,40};
        int brr[] = new int [arr1.length];
        for(int i =0; i<arr1.length;i++){
            brr[i] =arr1[i];  // this is deep
            System.out.print(brr[i]+"  ");
        }


    }
}
