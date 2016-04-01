package code.rpn;

import junit.framework.TestCase;

public class testRpn extends TestCase{
	
	
	public void test1()
	{
		RPNCalc obj = new RPNCalc();
		assertEquals("5", obj.calculate("2,3,+"));
	}
	public void test2()
	{
		RPNCalc obj = new RPNCalc();
		assertEquals("7", obj.calculate("4,3,+"));
	}
	public void test3()
	{
		RPNCalc obj = new RPNCalc();
		assertEquals("11", obj.calculate("4,3,+,4,+"));
	}
	public void test4()
	{
		RPNCalc obj = new RPNCalc();
		assertEquals("3", obj.calculate("4,3,+,4,-"));
	}
	
}
