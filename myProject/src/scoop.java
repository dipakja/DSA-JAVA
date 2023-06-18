







public class scoop {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        {
            a= 78;
         int c =99;
         // values intitialided in this block , will remain in the block
        
        //scoping in for loops
            for (int i = 0; i < 5; i++) {

                System.out.println(i);
            }
//            System.out.println(i); // scope error
        
        
        
        
        
        
        
        
        
        
        
        
        }
//        System.out.println(c);   // can't use outside the block
    }
static  void  random(int marks){
        int num = 67;
    System.out.println(num);
    System.out.println(marks);
}







}
