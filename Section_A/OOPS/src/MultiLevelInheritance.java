class GrandFather {
	int x = 20;
}

class Father extends GrandFather {
	int x = 40;
}

class Son extends Father {
	int x = 50;
	public Son(int x) {
		System.out.println("Local variable : " + x);
		System.out.println("Instance variable : " + this.x);
		System.out.println("Father Class : " + super.x);
		System.out.println("GrandFather Class : " + ((GrandFather)(this)).x);
		int total = x + this.x + super.x + ((GrandFather)(this)).x;
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
