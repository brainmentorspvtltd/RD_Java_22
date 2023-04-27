// final keyword could be used in 3 ways
// - final with class - we cannot inherit the final class
// - final with method - we cannot override final method
// - final with variable - we cannot change value of final variable

// final class Parent_2 {

class Parent_2 {
    final void show() {
        System.out.println("Hello");
    }
}

class Child_2 extends Parent_2 {
    // @Override
    // void show() {

    // }
}

public class FinalKeyword {
    public static void main(String[] args) {
        // Parent_2 obj = new Parent_2();
        // System.out.println("hello");
        final double PI = 3.14;
    }
}
