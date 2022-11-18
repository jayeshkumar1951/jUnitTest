package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitStrings = new jUnitFunctions();
		String final_string = junitStrings.AddStrings("Good", "Morning");
		assertEquals("GoodMorning", final_string);
	}

}
