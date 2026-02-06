import java.util.Scanner;

public class problem_loops {
    public static void main(String[] args) {
        //1. count the digit
//        System.out.println("Enter the number:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int numberofDigits =0;
//        int originalno=n;
//        while(n>0){
//            n=n/10;
//            numberofDigits++;
//
//        }
//        System.out.println("No of digits in " + originalno+ "="+ numberofDigits);

        //2. sum of digits
//        System.out.println("Enter the number to add digits:");
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int sumofDigits = 0;
//        int originalno = m;
//
//        while (m > 0) {
//            sumofDigits += m % 10;
//            m = m / 10;
//        }
//        System.out.println("Sum of digits in " + originalno + " = " + sumofDigits);

//        3.reversed no
//        System.out.println("Enter the number to reversed:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ans=0;
//        while(n>0){
//            ans =ans*10+n%10;
//            n /= 10;
//        }
//        System.out.println(ans);

//        4.sum of the following series  1-2+3-4+5-6.....
//        System.out.println("Enter the number to sum:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ans =0;
//        for(int i=1;i<=n;i++){
//            if(i%2==0){
//                ans -=i;
//            }
//            else{
//                ans+=0;
//            }
//        }
//        System.out.println(ans);

//        5.factorial no
//        System.out.println("Enter the number to get factorial:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int fact=1;
//        for(int i=1;i<=n;i++){
//            fact=fact*i;
//        }
//        System.out.println(fact);
        System.out.println("Enter the value of a:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the value of b:");
        Scanner sc1 = new Scanner(System.in);
        int m = sc1.nextInt();

        int ans=1;
        for(int i=1;i<=m;i++){
            ans=ans*n;
        }
        System.out.println(ans);
    }
}
