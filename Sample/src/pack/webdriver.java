package pack;



public interface webdriver {
	
	void get();
	String gettittle();
	String getText();
	

}
class FirefoxDriver implements webdriver
{
	public void  get()
	{
		System.out.println("get");
	}

	public String gettittle()
	{
		System.out.println("gettittle");
		return null;
	}
	public String getText()
	{
		System.out.println("gettext");
		return null;
	}
	public static void main(String[] args) {
		
		//FirefoxDriver driver=new FirefoxDriver();
		webdriver driver=new FirefoxDriver();
		
		driver.get("");
		String x=driver.gettittle();
		System.out.println(x);
		
		String y=driver.getText();
		System.out.println(y);
		
		
		
		
	}
}
