package pack;

public class This_class {

	
	static int count=0;
	{
		count++;
	}
	
	
	This_class() {
		
		
		System.out.println("o_or_con");
	
	}
	This_class(int i) {
		
		System.out.println("int_or_con");
		
	}
   This_class(float f) {
		
	   System.out.println("float_or_con");
		
	}
	
	public static void main(String[] args)
	{
		
		This_class th=new This_class();
		This_class th1=new This_class(10);
		This_class th2=new This_class(10.0f);
		
		System.out.println("no of objects are "+count);
	
	
	
		
		
		
		
		
		
		
	}
}
