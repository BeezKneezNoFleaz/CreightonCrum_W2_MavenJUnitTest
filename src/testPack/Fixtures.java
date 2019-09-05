package testPack;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Fixtures{
	protected int num1, num2;
	
	@Before
	public void setUp() throws Exception {
	    num1 = 6;
	    num2 = 6;
	}
	//Using the assertTrue assertion.
	@Test
	public void mathTest() {
		double result = num1 + num2;
	    assertTrue(result == 12);
	    System.out.println("Answer is 12!");
	    
	}

}
