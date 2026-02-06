public class continue_ {
    public static void main(String[] args) {

        myloop:for(int num=1;num<=50;num++){
            if(num%3==0){
            continue myloop;     //myloop =label
            }
            System.out.println(num);
        }

//        int num =1;
//        while(num<=50){
//            if(num%3==0){
//                num++;
//                continue;
//            }
//            System.out.println(num);
//            num++;
//        }

    }
}

//1 to 50 except 3