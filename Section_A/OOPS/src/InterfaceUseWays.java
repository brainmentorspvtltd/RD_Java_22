import java.util.ArrayList;

//SAM - Single Abstract Method

@FunctionalInterface
interface Calc {
	int add(int x, int y);
	//int sub(int x, int y);
}

//class MyCalc implements Calc {
//
//	@Override
//	public int add(int x, int y) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int sub(int x, int y) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
//}

public class InterfaceUseWays {

	public static void main(String[] args) {
		
//		Calc obj = new Calc() {
//			
//			@Override
//			public int sub(int x, int y) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//			@Override
//			public int add(int x, int y) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
		
		//Calc obj = (a,b) -> a + b;
		Calc obj = (a,b) -> {
			int z = a + b;
			return z;
		};
		System.out.println(obj.add(12, 20));
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ram");
		names.add("Shyam");
		names.add("Raman");
		
		names.forEach((name)->System.out.println(name));
		
		for(String n : names) {
			System.out.println(n);
		}

	}

}
