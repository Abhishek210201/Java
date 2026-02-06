package Array;
//TWO VARIABLE/ POINTER TECHNIQUE
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3,19,56,9,83,18,24,85,14};

//        int n =arr.length;
//        for (int i = 0; i < n/2; i++) {
//            int temp =arr[i];
//                arr[i] = arr[n-1-i];
//                arr[n-1-i] = temp;
//        }

        int n = arr.length;
        int i=0, j=n-1;
//        int i=2, j=5;      //custom part agar swapping karni ho toh
        while(i<j){
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
        }

        for (int ele: arr) {
            System.out.print(ele+" ");
        }
    }
}
