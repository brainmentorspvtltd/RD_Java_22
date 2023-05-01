class GrandFather {
	int x = 10;
}

class Father extends GrandFather {
	int x = 20;
}

class Son extends Father {
	int x = 40;
	public Son(int x) {
		System.out.println("GrandFather x : " + ((GrandFather)this).x);
		System.out.println("Father x : " + super.x);
		System.out.println("Son x : " + this.x);
		System.out.println("Local x : " + x);
		int total = x + this.x + super.x + ((GrandFather)this).x;
		System.out.println("Total : " + total);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Son obj = new Son(50);
	}

}
