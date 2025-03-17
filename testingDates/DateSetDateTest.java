package testingDates;

import org.junit.Test;
import org.junit.Assert.*;
public class DateSetDateTest {
	
	Date setter = new Date ("January", 1, 2000);
	
	@Test
	public void testSetDay() {
		setter.setDate("January", 20, 2000);
		AssertEquals(setter, new Date("January", 1, 2000));
		setter.setDate("January", 32, 2000);
		AssertEquals(setter, new Date("January", 20, 2000););
	}
}
