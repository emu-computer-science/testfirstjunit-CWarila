package testingDates;

import org.junit.*;
public class DateAddDaysTest {
	
	Date mid;
	Date monthNotEnd;
	Date monthEnd;
	Date yearNotEnd;
	Date yearEnd;
	
	@Before
	public void setUp() {
		mid = new Date("June", 14, 2000);
		monthNotEnd = new Date("June", 29, 2000);
		monthEnd = new Date("June", 30, 2000);
		yearNotEnd = new Date("December", 30, 2000);
		yearEnd = new Date("December", 31, 2000);
	}
	
	@Test
	public void testDummy() {
		temp = new Date("June", 15, 2000);
		AssertTrue("Didn't add a day.", mid.addOneDay.equals(temp));
	}
//	
//	@Test
//	public void testAddOneDay() {
//		AssertTrue("Didn't add a day.", mid.addOneDay.equals(Date("June", 15, 2000));
//		AssertFalse("Didn't add a day.", mid.addOneDay.equals(Date("June", 14, 2000));
//		AssertTrue("Didn't add a day.", yearNotEnd.addOneDay.equals(Date("December", 31, 2000));
//		AssertFalse("Didn't add a day.", yearEnd.addOneDay.equals(Date("December", 32, 2000));
//	}
//	
//	@Test
//	public void testAddAcrossMonth() {
//		AssertTrue("Didn't Cross Month.", monthEnd.addOneDay.equals(new Date("July", 1, 2000));
//		AssertFalse("Didn't Cross Month.", monthEnd.addOneDay.equals(new Date("June", 31, 2000));
//		AssertFalse("Didn't Cross Month.", mid.addOneDay.equals(new Date("July", 15, 2000));
//		monthEnd = new Date("August", 31, 2000);
//		AssertTrue("Didn't Cross Month.", monthEnd.addOneDay.equals(new Date("September", 1, 2000));
//	}
//	
//	@Test
//	public void testAddAcrossYear() {
//		AssertTrue("Didn't Cross Year.", yearEnd.addOneDay.equals(new Date("January", 1, 2001);
//		AssertFalse("Didn't Cross Year.", yearEnd.addOneDay.equals(new Date("January", 1, 2000);
//		AssertFalse("Didn't Cross Year.", yearNotEnd.addOneDay.equals(new Date("December", 31, 2001);
//	}
}
