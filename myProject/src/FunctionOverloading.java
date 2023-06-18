public class FunctionOverloading {
    public static void main(String[] args) {


fun("dipak");
        fun(3);
        int ans = sum(2,3);
       int an = sum(4,5,6);
        System.out.println(ans);
        System.out.println(an);
    }

    static  int sum(int a,int b){
        return a+b;
    } static  int sum(int a,int b,int c){
        return a+b+c;
    }
    static  void  fun(int a){
        System.out.println(a);
    }
    static  void  fun(String name){
        System.out.println(name);


    }

}
