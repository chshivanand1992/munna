package pack;



public class Rooms {

	int length;
	int width;
	public int calculatearea()
	{
		int area=length*width;
		System.out.println(area);
		return area;
	}
	
	
	public static void main(String[] args) {
		
		Rooms r1=new Rooms();
		
	       r1.length=10;
	       r1.width=8;
	       int room1=r1.calculatearea();
	       
	       Rooms r2=new Rooms();
		
	       r2.length=5;
	       r2.width=4;
	      int room2= r2.calculatearea();
	      
	      System.out.println(room1+room2);
		
	
		
	}
}
