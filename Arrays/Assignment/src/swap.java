import java.util.Arrays;

public class swap {

    public static void main(String[] args) {


        int[] arr= {2,3,4,5};
        System.out.println(arr);

int modi= swap(arr,1,2);
        System.out.println(modi);





    }


static  int swap(int[] arr, int index1,int index2)
{

    int temp = arr[index1];
    arr[index1]=arr[index2];
    arr[index2]=temp;

}




}
