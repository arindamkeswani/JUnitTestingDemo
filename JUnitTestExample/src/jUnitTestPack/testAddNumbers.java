package jUnitTestPack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		//fail("Not yet implemented");
		jUnitTesting junit=new jUnitTesting();
		double ans= junit.addNumbers(2, 5);
		//double ans2= junit.addNumbers(3, 5);
		assertEquals(7.0,ans);
		//assertEquals(15.0,ans2);
	}

}
