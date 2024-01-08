package day2;

import java.util.Random;
import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String sr = sc.next();
//        int sr1 = sc.nextInt();
//        int a =2;
//        switch (sr1){
//            case 1:
//                System.out.println("nihao");
//                break;
//            case 2:
//                System.out.println("nibuhao");
//                break;
//            default:
//        }
        int sum = 0;
        for (int i = 0; i < 100; i += 2) {
//            sum=sum+i;
            sum += i;
        }
        System.out.println("偶数和是=" + sum);
        int sum1=0;
        for (int i=0;i<100;i++){
            if (i%2==1){
                sum1+=i;
            }
        }
        System.out.println("奇数和为：" + sum1);

        System.out.println("....................................");
        //random随机数
        Random r = new Random();
        for (int i=0;i<10;i++) {
            int a = r.nextInt(10)+1;
            System.out.println(a);
        }
        System.out.println("...........");
        int b = r.nextInt(100+1);
        while (true){
           int c=sc.nextInt();
            if (c==b){
                System.out.println("猜中了");
                break;
            }
            else if (c<b){
                System.out.println("猜小了");
            }
            else {
                System.out.println("猜大了");
            }
        }
    }
}
