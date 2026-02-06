package Array;

public class MinOfarray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,1};
        int min=arr[0];
//        int min1=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min) min =arr[0];
        }
        System.out.println(min);
    }
}
