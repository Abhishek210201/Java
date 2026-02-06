package String;

public class lexographical {
    public static int compareTo(String s1,String s2) {
        int x= s1.compareTo(s2);
        return x;
    }
    public static void main(String[] args) {
        String s1="raghav";
        String s2= "preeti";
//        String s3="ragavji";
//        System.out.println(s1.compareTo(s2));  //intger return
//        System.out.println(s1.compareTo(s3));

        System.out.println(compareTo(s1,s2));


        //Concatenat
        System.out.println(s1.concat(s2));
        //&&
        s1=s1.concat(s2);
        System.out.println(s1);
    }
}
