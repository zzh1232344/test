package day2;

public class day4 {
    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 4};
        printarr(arr);

        System.out.println("。。。。。。。。。。。。。。。。");
        int arr1[]=null;
        int arr2[]={1};
        System.out.println(b(arr1, arr2));

    }

    public static void printarr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
    }

    public static boolean b(int[]arr1,int[]arr2){
        if (arr1==null&&arr2==null){
            return true;
        }
        if (arr1==null||arr2==null){
            return false;
        }
        if (arr1.length!=arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]!=arr2[i]){
                return false;
            }

        }
        return  true;
    }
}
