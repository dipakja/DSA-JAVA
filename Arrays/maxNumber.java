public class maxNumber {

    public static void main(String[] args) {

        int[] arr={2,45,21,56};


//        work on edge cases here,like array being null
        System.out.println(  max( arr, 0 , 3));



    }

    static  void reverse(int[] arr){

        for (int i = arr.length; i >0 ; i--) {


        }

    }
    static  int max(int[] arr,int start,int end)
    {

        if(arr==null){
            return -1;
        }



        int max= arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
        return  max;



    }


}
