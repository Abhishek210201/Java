package Array;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={6,8,1,2,4,9,0};
        int d=0;
        int n = arr.length;
//        reverse(arr,0,d-1);
//        reverse(arr,d,n-1);
//        reverse(arr,0,n-1);
        for(int ele: arr) System.out.print(ele);


    }
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }


}
