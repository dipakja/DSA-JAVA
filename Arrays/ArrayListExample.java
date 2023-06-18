import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(5);

        Scanner in = new Scanner(System.in);
     //wrapper data types full name Interger,Float,etc

//        list.add(67);
//        list.add(57);
//        list.add(87);
//        list.add(69);
//        list.add(65);
//        list.add(65);
//        list.add(65);
//        list.add(65);
//
//        System.out.println(list.contains(65));
// list.set(0,90);
// list.remove(2);
//        System.out.println(list);
//
//        input


        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());

        } for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));

        }

        System.out.println(list);

    }

}
