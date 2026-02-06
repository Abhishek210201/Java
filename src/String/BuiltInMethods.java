package String;

public class BuiltInMethods {
    public static void main(String[] args) {
        String s ="Arpit Bansal";
        System.out.println(s.indexOf('a'));
        // 2 & it gave first occurred & if not present then return -1
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println(s.contains("pit"));
        if(s.contains("rpit"))  { //return true
            System.out.println("happy");
        }

        System.out.println(s.startsWith("Ar"));
        System.out.println(s.endsWith("al"));

        String str ="123456789";
        int z=Integer.parseInt(str);
        System.out.println(z);



    }
}
