import java.util.Arrays;

public class orderAgnosticBS {


    public static void main(String[] args) {

        int[] arr = {1,2,31,45,67,78,88,99};

        int ans = agnostic(arr,88);
        System.out.println(ans);
//        String[] ans= new String[]{Arrays.toString(arr)};
//
//        System.out.println(Arrays.toString(ans));

    }

    static int agnostic(int[] arr,int target){

        int start=0;
        int end = arr.length -1;
// checking the array is ascending or descending
        boolean isAsc = arr[start]<arr[end];

        while (start<=end){

            // finding the mid of the array
           int mid = start + (end -start)/2;

           if(arr[mid]==target) {
               return mid;
           }
           else if (isAsc){

                   if(arr[mid]>target){
                       end = mid-1;
                   }else {
                       start = mid+1;
                   }

               }else {
                   if(arr[mid]<target){
                       end = mid-1;
                   }else {
                       start = mid+1;
                   }
               }

           }
        return -1;

    }



}
