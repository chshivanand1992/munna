package pack;

public abstract  class B 
{
	public abstract void m1();
	
	
	public void m2()
	{
		System.out.println("m4_method");
	}
	B()
	{
		System.out.println("o_arg");
	}
	
}
  class C extends B
{
	 
	  C()
	  {
		  super();
	  }
	 public void m1()
	 {
		 System.out.println("m1_method");
	 }

 
	
	public static void main(String[] args) {
		
	C c=new C();
		
		
	
		
		
		
		
		
			
		}
	
}

	


