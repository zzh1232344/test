import java.util.Scanner;

public class PingWeiDaFen {
    public static void main(String[] args) {
        System.out.println("当前选手得分是是："+getaveragescore(4));
    }
public static double getaveragescore(int num){
        int[]scores=new int[num];
    Scanner sc= new Scanner(System.in);
    for (int i = 0; i < scores.length; i++) {
        System.out.println("请录入第"+(i+1)+"个评委的分数:");
        int score = sc.nextInt();
        scores[i]=score;
    }
    int sum = 0;
    int max=scores[0];
    int min=scores[0];
        for (int i = 0; i < scores.length; i++) {
        int score=scores[i];
        //总分
        sum+=scores[i];
        if (score>max){
            max=score;
        }
        if (score<min){
            min=score;
        }
        }
        return 1.0*(sum-max-min)/(num-2);

    }

}

