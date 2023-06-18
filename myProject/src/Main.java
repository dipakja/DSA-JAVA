
public class Main {

    public static void main(String[] args) {
        String name = "dipak jadhav";

        String meassage = mygreet(name);
        System.out.println(meassage);

    }
    static String mygreet(String name)
    {
        String message = "Hello"+ " " + name;
        return message;
    }

}