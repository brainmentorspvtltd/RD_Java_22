class Customer {
    // static - comes into memory only once
    // it will get loaded with class
    static int id;
    String name;
    int phone;
    Customer(String name, int phone) {
        id++;
        this.name = name;
        this.phone = phone;
    }
    void show() {
        System.out.println("Cutomer ID : " + id);
        System.out.println("Customer Name : " + this.name);
        System.out.println("Customer Phone : " + this.phone);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Customer ram = new Customer("Ram", 789789789);
        ram.show();
        Customer shyam = new Customer("Shyam", 789789789);
        shyam.show();

        ram.show();
    }
}
