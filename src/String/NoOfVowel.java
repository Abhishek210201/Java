package String;

//import java.util.Scanner;

public class NoOfVowel {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String:");

//        String str ="Abhishek is Red flag";
//        for (int i = 0; i < str.length(); i++) {
//            System.out.print(str.charAt(i));
//        }

        int m=0;
        String s="qwefghjkuysxcvbhtresxcvbnkloplkmkiuhbnuyfvbgtrewawessesasdcvbnjhgf";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                m++;
            }
        }

        System.out.println(m);

    }
}
