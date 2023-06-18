public class shadowing {

    static  int x=90; // this will be shadowed at line 9


    public static void main(String[] args) {
        System.out.println(x);
        int x;// it will five 34 // declearation
        x=40; // intialized
        System.out.println(x);

         fun();

// practice using two variables

    }

    static  void  fun(){

        System.out.println(x);// it will give 90


    }












}
