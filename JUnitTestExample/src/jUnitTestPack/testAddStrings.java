package jUnitTestPack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		//fail("Not yet implemented");
		jUnitTesting junitS= new jUnitTesting();
		String res= junitS.addStrings("Arindam ","Keswani");
		assertEquals("Arindam Keswani",res);
		//assertEquals("ArindamKeswani",res);
	}

}
