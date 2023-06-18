
public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,31,45,67,78,88,99};
int ans = binaryserach(arr,88);
        System.out.println(ans);
    }
// return the index
    // return -1 if it does not exist
    static  int binaryserach(int[] arr, int target){

        int start=0;
        int end = arr.length -1;
        while (start<=end){
//            int mid = (start+end)/2; might be possible that (start +end) value exceed the integer value

       int mid = start+(end-start)/2;

       if(target<arr[mid]){
           end=mid-1;
       }else if (target>arr[mid]){
           start = mid+1;
       }else {
           return mid;
       }

        }

return -1;
    }
}