package testing;

import org.junit.Test;

import junit.framework.Assert;

public class assertion {

String a = "10";

String b = "1";

   
 int ab  = Integer.parseInt(a);
 
 int bc = Integer.parseInt(b);

 
 int n = 8;
 
 String v = Integer.toString(n);
 
String s = "8";

	@Test
	public void testa()
	
	{
		
		Assert.assertEquals(s, v);
		
		
	}

}
