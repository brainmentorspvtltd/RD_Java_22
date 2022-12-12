public class Example {

    // Global Variable
    static int x = 120;
    public void show() {
        // Local variable of show
        int y = 20;
    }

    public static void main(String[] args) {
        // Local Variable
        int z = 100;
        System.out.println(x);
        String str = "hello world";
        String str_1 = "hello world";
        // it will check value of two strings
        System.out.println(str.equals(str_1));
        // it will check reference of two strings
        System.out.println(str == str_1);
    }
}