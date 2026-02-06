package BasicSortingAlgorithm;

public class SelectionSort {
    public static void print(int[] arr) {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //int[] arr={5,-2,6,7,2,8,7,2};
        int[] arr={7,3,4,7,8,1};
        int n = arr.length;
        print(arr);

        for (int i = 0; i < n-1; i++) {
            int min =Integer.MAX_VALUE;
            int mindex =0;
            for (int j = i; j < n; j++) {
                if(arr[j]<min){
                    min=arr[j];
                    mindex=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]= arr[mindex];
            arr[mindex]=temp;
        }
//      HW  for ulta sort
//        for (int i = 0; i < n-1; i++) {
//            int min =Integer.MIN_VALUE;
//            int mindex =0;
//            for (int j = i; j < n; j++) {
//                if(arr[j]>min){
//                    min=arr[j];
//                    mindex=j;
//                }
//            }
//            //swap
//            int temp=arr[i];
//            arr[i]= arr[mindex];
//            arr[mindex]=temp;
//        }
        print(arr);
    }
}
