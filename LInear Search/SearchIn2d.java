import java.util.Arrays;

public class SearchIn2d {


    public static void main(String[] args) {

        int[][] arr={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
      int target = 18;
     int[] ans = search(arr,target); //format of return value {row,col}
        System.out.println(Arrays.toString(ans));

    }


static  int[] search(int[][] arr,int target)
{
    for (int rows = 0; rows < arr.length; rows++) {
        for (int col = 0; col <arr[rows].length ; col++) {


            if(arr[rows][col]==target)
            {
                return  new int[] {rows, col};
            }

        }

    }

    return new int[] {-1,-1};
}










}
