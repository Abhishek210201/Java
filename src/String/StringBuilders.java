package String;

import java.util.ArrayList;

public class StringBuilders {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Abhishek");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.append("Dhuriya");
        System.out.println(sb);

        sb.setCharAt(1,'v');
        System.out.println(sb );

    }
}
