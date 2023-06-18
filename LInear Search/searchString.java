public class searchString {


    public static void main(String[] args) {

        String name="dipak";
        char target = 'r';
        System.out.println(serach( name, target));

    }

    static  boolean serach(String str, char target){

if(str.length()==0){
    return  false;
}
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true;
            }
        }

//    for (char ch:str.toCharArray())
//    {  if (ch==target){
//        return true;
//    }
//
//    }


    return  false;

    }


}
