package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest {

	@Test
	public void test() {
		
		assertTrue("Did not return true", MyClass.ReturnTrue());
		
		assertEquals("Did not add up" , 2, MyClass.AddTwoNumbers(1, 1));
		
	}

}
