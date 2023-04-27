class GrandParent {
    int x = 10;
}

class Parent extends GrandParent {
    int x = 20;
}

class Son extends Parent {
    int x = 30;
    Son(int x) {
        int total = x + this.x + super.x + ((GrandParent)this).x;
        System.out.println("Sum is : " + total);
    }
}



public class MultilevelInheritance {
    public static void main(String[] args) {
        Son obj = new Son(12);
    }
}
