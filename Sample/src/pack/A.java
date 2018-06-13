package pack;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class A {
	
	

	
public static void main(String[] args) throws Exception 
{
		
	Runtime.getRuntime().exec("Calc.exe");
	
	StringSelection s=new StringSelection("657");
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	
	Thread.sleep(4000);
	Robot r=new Robot();
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	
	Thread.sleep(4000);
	
r.keyPress(KeyEvent.VK_ADD);
r.keyRelease(KeyEvent.VK_ADD);

Thread.sleep(4000);

StringSelection s1=new StringSelection("657");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);

r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_CONTROL);

Thread.sleep(4000);
r.keyPress(KeyEvent.VK_EQUALS);
r.keyRelease(KeyEvent.VK_EQUALS);

Thread.sleep(4000);

r.keyPress(KeyEvent.VK_CONTEXT_MENU);
r.keyRelease(KeyEvent.VK_CONTEXT_MENU);

Thread.sleep(4000);

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

Thread.sleep(4000);


r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(4000);
 Object o= Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);

 String str=(String)o;
 
 System.out.println(str);
 
 
 














			
	}

}
