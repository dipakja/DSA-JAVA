public class MinArray {


    //Q.1  Find the min element in the array



    public static void main(String[] args) {
        int[] arr = {2,3,54,78,-2,-5};
        System.out.println(findmin(arr));

    }

    static  int findmin(int[] arr){

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }


        }
        return min;

    }


}
