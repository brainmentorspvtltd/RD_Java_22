abstract class Player {
    int x;
    int y;
    int w;
    int h;
    abstract void punch();
    abstract void kick();
    void move() {

    }

    void jump() {

    }

    void run() {

    }
}

class King extends Player {

    @Override
    void punch() {

    }

    @Override
    void kick() {

    }

}

class Eddy extends Player {
    @Override
    void punch() {

    }

    @Override
    void kick() {
        
    }
}

class Paul extends Player {
    @Override
    void punch() {

    }

    @Override
    void kick() {
        
    }
}

class Law extends Player {
    @Override
    void punch() {

    }

    @Override
    void kick() {
        
    }
}

class Lee extends Player{
    @Override
    void punch() {

    }

    @Override
    void kick() {
        
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // Player obj = new King();
    }
}
