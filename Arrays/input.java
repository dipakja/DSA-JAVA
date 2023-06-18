import java.util.Arrays;
import java.util.Scanner;

public class input {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


//        int[] arr1 = new int[5];
//
//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 34;
//        arr[2] = 23;
//        arr[3] = 34;
//        arr[4] = 23;

//[12,34,23,34,23]
//        System.out.println(arr);
//
//// input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
////            System.out.println(arr[i] + "");
//        }
//        System.out.println(Arrays.toString(arr));

//        for (int num:arr){ // ofr every element in array , print the element
//            System.out.println(num + " ");// here num represetns element of the array
//        }
//
//        System.out.println(arr[4]);

  // Arrays of objects


        String[] str = new String[4];
        for (int s = 0; s < str.length ; s++) {

            str[s] = in.next();


        }


        System.out.println(Arrays.toString(str));


        //modify
        str[1]="dipak";
        System.out.println(Arrays.toString(str));







    }


}
