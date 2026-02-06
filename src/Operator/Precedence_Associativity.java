public class Precedence_Associativity {
    public static void main(String[] args) {
        int p=4,q=3,r=2;
        int s= p - ++r - ++q;
        System.out.println(s);
    }
}
