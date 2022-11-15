import java.util.ArrayList;

class JavaCollection{
    public static void main(String[] args) {
        // Java 1.5 (Generic)
        // CRUD
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1000);
        list.add(7777);
        list.add(1,99);
        list.remove(0);
        list.set(0, 10000);
        System.out.println(list);
        list.forEach(i->System.out.println(i));
        // list.add("Amit");
        // list.add(10.20);
        // list.add(true);
    }
}