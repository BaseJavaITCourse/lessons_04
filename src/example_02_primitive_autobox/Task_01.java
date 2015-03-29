package example_02_primitive_autobox;

public class Task_01 {

	public static void main(String[] args) {
		int nubInt = 20;
		Integer i = nubInt;

		int number = i + nubInt;

		// auto boxing -> i.intValue() & auto unboxing.
		System.out.println("number = "+number);
		
		Integer i1 =15;
		int i3 = i1;
		
		System.out.println("i3 = "+i3);

	}

}
