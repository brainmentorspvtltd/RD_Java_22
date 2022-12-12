public class StaticExample {
    static int x = 100;

    public static void main(String[] args) {
        StaticExample obj = new StaticExample();
        System.out.println(x);
        
        StaticExample obj_2 = new StaticExample();
        System.out.println(x);
        
        StaticExample obj_3 = new StaticExample();
        System.out.println(x);
        
        StaticExample obj_4 = new StaticExample();
        System.out.println(x);
    }
}