package Methods;

public class ReturnIsMandatory {
   public static void main(String[] args) {
        System.out.println(ananya(8));
    }
    public static int ananya(int a) {
        if (a < 5) {
            return a;
        }
        return -10;        //return in case of if else in
    }

}
