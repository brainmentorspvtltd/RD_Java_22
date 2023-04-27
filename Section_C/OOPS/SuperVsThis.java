class Parent_1 {
    int x;
    Parent_1() {
        x = 10;
        System.out.println("Parent Class Const...");
    }
    Parent_1(int x) {
        this();     // will call parent class default const...
        System.out.println("Parent Class Param Const...");
    }
}

class Child_1 extends Parent_1 {
    int x;
    Child_1() {
        // super();    // internally java calls parent class constructor
        super(100);   // will call parent class param constructor
        x = 20;
        System.out.println("Child Class Const...");
    }
    Child_1(int x) {
        this(); // child class default constructor
        // int total = local variable + instance  variable + parent variable
        int total = x + this.x + super.x;
        System.out.println("Total is : " + total);
        System.out.println("Child Class Param Const...");
    }
}

public class SuperVsThis {
    public static void main(String[] args) {
        // Child_1 obj = new Child_1();
        Child_1 obj = new Child_1(50);
    }
}
