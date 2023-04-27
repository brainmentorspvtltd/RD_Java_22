public class TypePromotion {

    void show(byte x) {
        System.out.println("Byte X");
    }
    void show(short x) {
        System.out.println("Short X");
    }
    // void show(int x) {
    //     System.out.println("Int X");
    // }
    // void show(float x) {
    //     System.out.println("Float X");
    // }
    // void show(long x) {
    //     System.out.println("Long X");
    // }
    // void show(double x) {
    //     System.out.println("Double X");
    // }
    // void show(Integer x) {
    //     System.out.println("Integer Wrapper X");
    // }
    // void show(Float x) {
    //     System.out.println("Float Wrapper X");
    // }
    // void show(int ...x) {
    //     System.out.println("Var Args X");
    // }

    public static void main(String[] args) {
        TypePromotion obj = new TypePromotion();
        // by defualt it will call int method
        // if int is not available then it will call long - type promotion
        // if long is not available then it will call float
        // it float is not available then it will call double
        // if double is not available then it will search Wrapper Class Integer
        // if wrapper classes are not available then it will search var args method
        //obj.show(23,3,56,8,2,6);

        // to execute byte or short
        obj.show((byte)34);
        obj.show((short)12);

        // Wrapper Classes
        int x = 12;
        // Autoboxing
        Integer x1 = x;     // Boxing
        int x2 = x;         // Unboxing

        // Integer x3 = new Integer(x);
        
    }
}
