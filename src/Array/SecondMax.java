package Array;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};

        int max =Integer.MIN_VALUE;
        int smax =Integer.MIN_VALUE;

        //calculate Max
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max) max=arr[i];
        }

        // calculate second Max
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>smax && arr[i]!=max) smax=arr[i];
        }

        System.out.println(max);
        System.out.println(smax);

    }
}

