// DRY - Donot Repeat Yourself

package OOPS;

class Student {
    // Instance Variable
    String name;
    int rollNo;
    double percentage;

    void takeInput(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    void showDetails() {
        // this - current object reference
        System.out.println("Name : " + this.name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Percentage : " + percentage);
    }
}

public class StudentClassDemo {
    public static void main(String[] args) {
        Student obj = new Student();
        // obj.name = "Ram";
        // obj.rollNo = 101;
        // obj.percentage = 67.55;
        obj.takeInput(101, "Ram", 56.66);
        obj.showDetails();
        // System.out.println("Name : " + obj.name);
        // System.out.println("Roll No : " + obj.rollNo);
        // System.out.println("Percentage : " + obj.percentage);

        Student obj_2 = new Student();
        // obj_2.name = "Shyam";
        // obj_2.rollNo = 102;
        // obj_2.percentage = 74.55;
        obj_2.takeInput(102, "Shyam", 77.44);
        obj_2.showDetails();
        // System.out.println("Name : " + obj_2.name);
        // System.out.println("Roll No : " + obj_2.rollNo);
        // System.out.println("Percentage : " + obj_2.percentage);
    }
}
