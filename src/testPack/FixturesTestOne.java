package testPack;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FixturesTestOne {
	String message = "Hello World!";	
	MessageUtil messageUtil = new MessageUtil(message);

	
	@Before
	public void setUp() throws Exception {

	}
	//Using the assertEquals assertion.
	@Test
	public void msgTest() {
	      System.out.println();    
	      assertEquals(message, messageUtil.printMessage());     

	}

}
