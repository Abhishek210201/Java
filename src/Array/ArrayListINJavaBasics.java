package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListINJavaBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);  //adding the value in the arrays
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);

        System.out.println(arr.get(3)); // arr[3]
        arr.set(3,50);    //arr[3] =50

        System.out.println(arr); //not traversing in the array
        // Or
//        int n =arr.size();
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr.get(i)+" ");
//        }
//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }

        //25 21 18 50 10
        arr.add(3,34);
        System.out.println(arr);    // [25, 21, 18, 34, 50, 10]

        arr.remove(1);     //n-1 --> arr.size()
        System.out.println(arr);

        Collections.reverse(arr);
        System.out.println(arr);

        int i=0,j=arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);

        ArrayList<Character> arr2 = new ArrayList<>();  //Double String
        // hw -> {3,5,2,0,7} + {9,2,1} = {3,6,1,2,8}


    }
}
