import java.lang.reflect.Array;
import java.util.Arrays;

public class functionPassing {


    public static void main(String[] args) {

        int[] nums = {3,4,5,2,7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }

    static  void  change(int[] arr){

        arr[0]=90;
    }







}
