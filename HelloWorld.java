package test;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("helloworld");
        int age = 10;
        System.out.println(age);
        int a = 4;
        int b = 2;
        System.out.println(a++);
        System.out.println(++b);
        a += 2;
        System.out.println("...............................");
        System.out.println(a);
        boolean c = 2 > 3 & 3 > 1;
        boolean d = 2 > 3 | 3 > 1;
        double score = 60;
        String sr = score >= 70 ? "成绩及格" : "成绩不及格";
        System.out.println(sr);

        //接收键盘数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄:");
        int age1 = sc.nextInt();
        System.out.println("你的年龄是:"+age1);
        System.out.println("请输入你的名字:");
        String name = sc.next();
        System.out.println("你的名字是："+name);


    }
}
