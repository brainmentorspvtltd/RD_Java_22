// Functional Interface SAM - Single Abstract Method
@FunctionalInterface
interface Calc {
    int add(int x, int y);
    // int sub(int x, int y);
}

// class MyCalc implements Calc {
//     @Override
//     public int add(int x, int y) {
//         return x + y;
//     }
//     @Override
//     public int sub(int x, int y) {
//         return x - y;
//     }
// }

public class UsingInterface {
    public static void main(String[] args) {
        // MyCalc obj = new MyCalc();   
        Calc obj = new Calc() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
            // @Override
            // public int sub(int x, int y) {
            //     return x - y;
            // }
        };
        System.out.println(obj.add(12, 20));

        // Lambda Expressions
        // (a,b) - arguments
        // a + b - return 
        // Calc obj_2 = (a,b) -> a + b;
        // System.out.println(obj_2.add(23, 10));

        Calc obj_2 = (a,b) -> {
            int z = a + b;
            return z;
        };
        System.out.println(obj_2.add(12, 20));

    }
}
