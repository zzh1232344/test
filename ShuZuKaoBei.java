public class ShuZuKaoBei {
    public static void main(String[] args) {
        int[] arr={11,22,33};
        int []arr1=copy(arr);
        print(arr1);


    }
    public static void print(int[]arr){
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(i==arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.print("]");
    }

    public static int[] copy(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=arr[i];
        }
        return arr1;

    }
}
