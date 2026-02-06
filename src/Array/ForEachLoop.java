package Loops;

public class ForEachLoop {
    public static void main(String[] args) {
        // used to traverse data structure    cant modify array elemt
        int[] arr = {5,8,2,6,9};
        for (int ele: arr ) {
            System.out.print(ele+" ");
        }
        for (int ele: arr ) {
            ele*=2;               // DOES NOT WORK
        }

        for (int ele: arr ) {
            System.out.print(ele+" ");
        }


    }
}
