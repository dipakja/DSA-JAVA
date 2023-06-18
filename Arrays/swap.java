import java.util.Arrays;
import java.util.Scanner;

public class swap {

//    public static void main(String[] args) {
//        int[] arr={2,3,42,56};
//        System.out.println(Arrays.toString(arr));
//        swap(arr,1,2);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void swap(int[] arr,int index1, int index2)
//    {
//        int temp = arr[index1];
//        arr[index1]=arr[index2];
//        arr[index2]=temp;
//    }
public static void main(String[] args) {


    Scanner in = new Scanner(System.in);

    int[] arr = new int[4];

    for (int i = 0; i < 3; i++) {

       arr[3]=in.nextInt();

    }
    System.out.println(Arrays.toString(arr));
    swap(arr,1,2);
    System.out.println(Arrays.toString(arr));

//    System.out.println(Arrays.toString(arr));




}
static  void swap(int[] arr,int index1,int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
}


}
