import java.util.Arrays;

// variable length argument
public class VarArgs {

    public static void main(String[] args) {

// fun(2,3,4,5,6,7);
        fun();
multiple(2,3,"dipak","jadhav");

    }

    static  void  multiple(int a,int b,String ...v){


    }

    static  void  fun(int...v){//if you don't know how many inputs have to take the
        // you cna use this method and it will create an array

        System.out.println(Arrays.toString(v));

    }

}
