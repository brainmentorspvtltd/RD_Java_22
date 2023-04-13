class User {

}

class PrimeUser extends User {

}

class P1 {
    User add(int x, int y) {
        User obj = new User();
        return obj;
    }
}

class C1 extends P1 {
    @Override
    PrimeUser add(int x, int y) {
        System.out.println("Add method...");
        PrimeUser obj = new PrimeUser();
        return obj;
    }
}

public class CovariantReturnType {
    public static void main(String[] args) {
        
    }
}
