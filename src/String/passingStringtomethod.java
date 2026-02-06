package String;
//
public class passingStringtomethod {
    public static void change(String x) {
        x="Tom";
    }
    public static void main(String[] args) {
        String x="Abhishek";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }

    //Abhishek
    //Abhishek
}
