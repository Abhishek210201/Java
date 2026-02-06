public class Assignment {
    public static void main(String[] args) {
        int p=10;
        int q;

        // ==
        q=p;
        System.out.println(q);

        // +=
        p+=q; //p=pq
        System.out.println(p); //20

        // -=
        p-=q; //p=p-q
        System.out.println(p); //10

        // *=
        p*=q; //p=p*q
        System.out.println(p); //100

        // /=
        p/=q; //p=p/q
        System.out.println(p);  //10
    }
}
