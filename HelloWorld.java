package Hello;

import javax.swing.plaf.ToolBarUI;

/**
 * 
 * @author enunez
 *@version
 */
public class HelloWorld {
	public static void main (String[] args) {
		System.out.println("Hello World Sets!");
	}

	public String SomeMethod( Object obj) 
	{
		if(obj instanceof Exception) {
			return (((Exception) obj).getMessage());
			}
			return "Not an exception";
	}
}
