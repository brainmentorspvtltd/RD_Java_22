interface IPlayer {
    // void walk();        // public abstract void walk();
    // void run();
    // void jump();
    void punch();
    void kick();
    int SPEED = 10;     // public final int SPEED = 10;\
    default void walk() {

    }
    static void run() {
        
    }
}

// abstract class CommonFunctionality implements IPlayer {

//     @Override
//     public void walk() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'walk'");
//     }

//     @Override
//     public void run() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'run'");
//     }

//     @Override
//     public void jump() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'jump'");
//     }
    
// }

class Panda implements IPlayer {

    @Override
    public void punch() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'punch'");
    }

    @Override
    public void kick() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kick'");
    }
    
}

class Bryan implements IPlayer {

    @Override
    public void punch() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'punch'");
    }

    @Override
    public void kick() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kick'");
    }

}

public class InterfaceDemo {
    public static void main(String[] args) {
        
    }
}
