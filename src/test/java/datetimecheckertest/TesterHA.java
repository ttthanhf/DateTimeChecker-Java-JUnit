package datetimecheckertest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import datetimechecker.DateTimeChecker;

public class TesterHA {
	@Test
	public void checkDateUTCID01() {
	    boolean rs = DateTimeChecker.validDate("324kjjadsf", 200, 2000);
	    assertEquals(false, rs);
	}
	
	@Test
	public void checkDateUTCID02() {
	    boolean rs = DateTimeChecker.validDate(null, 1, 2000);
	    assertEquals(false, rs);
	}
	
	@Test
	public void checkDateUTCID03() {
	    boolean rs = DateTimeChecker.validDate(2075982357, 2, 2003);
	    assertEquals(false, rs);
	}
	
	@Test
	public void checkDateUTCID04() {
	    boolean rs = DateTimeChecker.validDate(1, "String", 2000);
	    assertEquals(false, rs);
	}
	
	@Test
	public void checkDateUTCID05() {
	    boolean rs = DateTimeChecker.validDate(1, 35, 2000);
	    assertEquals(false, rs);
	}
}
