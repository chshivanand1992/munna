package pack2;

public interface webdriver {
	
	String getText();
	String gettittle();
	void get(String url);
	String getcurrenturl();
	
	

}
class Chromedriver implements webdriver
{
	public  String getText()
	{
		System.out.println("get the text");
		return null;
	}
	
	public  String gettittle()
	{
		System.out.println("get the tittle of webpage");
		return null;
	}
	public void get(String url)
	{
		System.out.println("launch the site");
	}
	public String getcurrenturl()
	{
		System.out.println("get current url of webpage");
		return null;
	}
	public static void main(String[] args) {
		
		//Chromedriver driver=new Chromedriver();
		
		webdriver driver=new Chromedriver();
		
		driver.get("http://www.google.com");
		
		String x=driver.getText();
		System.out.println(x);
	}
}
