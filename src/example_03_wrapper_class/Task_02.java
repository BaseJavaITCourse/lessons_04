package example_03_wrapper_class;

public class Task_02 {

	public static void main(String[] args) {

		int numberMax = Integer.MAX_VALUE;
		
		int numberMin = Integer.MIN_VALUE;
		
			
		
		System.out.println("numberMax-> " + numberMax + " numberMin-> "
				+ numberMin);
		
		
		//int numberM = Integer.valueOf("2");
		
		
		String str = "123";	
				
		int i4 = Integer.parseInt(str);	
		
		System.out.println(i4);
		
		
		
		double d = Double.valueOf(str);
		
		System.out.println(d);
   }
}
