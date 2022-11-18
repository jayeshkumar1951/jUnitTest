package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumberss {

	@Test
	public void test() {
		jUnitFunctions juunit = new jUnitFunctions();
		int res = juunit.AddNumbers(10, 11);
		assertEquals (21, res);
	}

}
