import java.util.Scanner;

public class ShuZuJiaMi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的密码:");


        System.out.println("你的加密密码是："+password(sc.nextInt()));
    }

    public static String password(int num) {
        //把密码拆分成一个一个的数字
        int[] num1 = slist(num);
        //进行加密

        for (int i = 0; i < num1.length; i++) {
            num1[i] = (num1[i] + 5) % 10;
        }
        swap(num1);
        //拼接
        String data = "";
        for (int i = 0; i < num1.length; i++) {
            data += num1[i];
        }

        return data;


    }

    public static void swap(int[] num1) {
        for (int i = 0,j= num1.length-1; i <j ; i++,j--) {

            int temp=num1[j];
            num1[j]=num1[i];
            num1[i]=temp;
        }
    }

    public static int[] slist(int num) {
        int[] num2 = new int[4];
        num2[0] = num / 1000;
        num2[1]=(num/100)%10;
        num2[2]=(num/10)%10;
        num2[3]=num%10;
        return num2;

    }
}
