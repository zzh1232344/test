import java.util.Random;
import java.util.Scanner;

public class QiangHongBao
{
    public static void main(String[] args) {

        int[]moneys={12,2,33,1,111,};
        start(moneys);
    }
    public static void start(int[]moneys){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 1; i <=5; i++) {
            System.out.println("请您输入任意内容进行抽奖");
            sc.next();//等待用户输入内容，按回车才会继续进行；
            while (true) {
                int index = r.nextInt(moneys.length);
                int money=moneys[index];
                if (moneys[index]!=0){
                    System.out.println("恭喜您抽中了" + moneys[index]);
                    moneys[index]=0;
                    break;
                }
            }
        }
        System.out.println("活动结束了");
    }
}
