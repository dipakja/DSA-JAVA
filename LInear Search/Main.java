import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] nums = {2, 34, 5, 0, 64, -3, 6, 1};
        int target = 64;

        Boolean ans = linearSerach(nums, target);
        System.out.println(ans);
    }

    // Search in the array : return the index if item found
    // otherwise if item not found return -1
    static Boolean linearSerach(int[] arr, int target) {

        if (arr.length == 0) {
            return false;
        }
// run a for loop

        for (int index = 0; index < arr.length; index++) {

            //check for element at every index if it is =traget

            int element = arr[index];
            if (element == target) {
                return true;
            }


        }
        return false;
    }

}
