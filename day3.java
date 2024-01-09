package day2;

public class day3 {
    public static void main(String[] args) {
        int[] age = new int[]{1, 2, 3, 4, 5};
        String[] name = new String[]{"aas ", "aa"};
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
        int[] money = {43, 121, 32, 4, 42};
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println(sum);
        int[] num = {21, 12, 432, 22, 122, 11};
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println(max);
        System.out.println("................");
        int[] a = {12, 33, 432, 22, 11};
        for (int i = 0; i < a.length; i++) {
            for (int j=0;j<a.length-1;j++){
                if (a[i]<a[j]) {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }

        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }


    }
}
