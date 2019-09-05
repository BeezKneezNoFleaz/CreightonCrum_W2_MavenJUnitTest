package testPack;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FixturesTestTwo {
	String message = "Hello.. Hello.. Hello.. Is anybody in there!?!?";	
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Before
	public void setUp() throws Exception {
	    message = "Hello.. Hello.. Hello.. Is anybody in there!?!?";
	}
	//Using the assertFalse assertion.
	@Test
	public void falseTest() {
		System.out.println();
		assertFalse(messageUtil.isThisFalse(message));
	}
	//Don't think I did this assertion quite right but i did make it fail and read false.
}
