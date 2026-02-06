package Methods;

public class swap2no {
    public static void swap(int a ,int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.print(a+" "+b);   //using pass by value and reference 

    }
    public static void main(String[] args) {
        int a =10,b=20;
        System.out.println(a+" "+b);
        swap(a,b);

    }
}
