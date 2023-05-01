interface IPlayer {
//	void move();		// abstract public void move();
	default void move() {
		
	}
	void jump();
	void run();
	void punch();
	void kick();
	int JUMP = 10;		// final public int JUMP = 10;
//	private void kick() {
//		
//	}
}

abstract class CommonPlayer implements IPlayer{
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

class King extends CommonPlayer implements IPlayer {
	
	public King() {
		//JUMP = 30;
	}
	
	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}
	
}

class Law extends CommonPlayer implements IPlayer {

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}
	
}


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
