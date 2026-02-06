package Array;

public class PassingArrayToMethods {  //Pass by refrence =array
    public static void main(String[] args) {
        int[] x={10,3,29,35,48};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]); //variable = pass by value
    }
    public static void change(int[] x) {
        x[2] = 99;

    }
}
