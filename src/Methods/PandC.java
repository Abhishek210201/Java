package Methods;
import java.util.Scanner;
public class PandC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int r =sc.nextInt();
        //ncr

//        int nFact=1;
//        for(int i=1;i<=n;i++){
//            nFact *=i;
//        }
//        int rFact =1;
//        for(int i=1;i<=r;i++){
//            rFact *=i;
//        }
//        int nMinusRFact =1;
//        for(int i=1;i<=n-r;i++){
//            nMinusRFact *=i;
//        }
//
//        int ncr =nFact/(rFact*nMinusRFact);
//        System.out.println(ncr);

        int ncr = fact(n)/(fact(r)*fact(n-r));
        System.out.println(ncr);
        int npr = fact(n)/(fact(n-r));
        System.out.println(npr);
    }


    public static int fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }
}
