package String;

public class StringToCharArray {
    public static void main(String[] args) {
        String s ="Ruhan";
        char[] arr=s.toCharArray();    //isTareekeKoCamelCaseKehteHai and IsePascalKehteHai

        for(char ch:arr){
            System.out.print(ch);
        }
    }
}
