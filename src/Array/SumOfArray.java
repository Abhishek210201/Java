package Array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        int sum=0;
//        for(int i=0;i<n;i++){
//            sum += arr[i];
//        }
//        System.out.println(sum);


//        int [] arr1 ={-6, 8 ,14,-2,23,47,-7};
//        int sum1=0;
//        for(int i=0;i<arr1.length;i++){
//            sum1 += arr1[i];
//        }
//        System.out.println(sum1);
//        int prod=1;
//        for(int i =0 ;i< arr1.length;i++){
//            prod *= arr1[i];
//        }
//        System.out.println(prod);

        int prod=1;
        for(int i =0 ;i< n;i++){
            prod *= arr[i];
        }
        System.out.println(prod);
    }
}
