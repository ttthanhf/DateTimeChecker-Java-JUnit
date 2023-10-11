/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package datetimecheckertest;

import org.junit.jupiter.api.Test;

import datetimechecker.DateTimeChecker;
import datetimechecker.DateTimeCheckerV2;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ThanhF
 */
public class DateTimeCheckerTest {
//  @Test
//  public void testIsLeapYear() {
//      boolean rs = DateTimeChecker.isLeapYear(2000);
//      assertEquals(true, rs);
//  }
//
//  @Test
//  public void testValidDay() {
//      boolean rs = DateTimeChecker.validDay(29);
//      assertEquals(true, rs);
//  }
//
//  @Test
//  public void testValidMonth() {
//      boolean rs = DateTimeChecker.validMonth(12);
//      assertEquals(true, rs);
//  }
//
//  @Test
//  public void testValidDayInMonth() {
//      boolean rs = DateTimeChecker.validDayInMonth(29, 2, 2000);
//      assertEquals(true, rs);
//  }
	//////////////////////////
	@Test
	public void testValidDate() {
		boolean rs = DateTimeChecker.validDate(29, 2, 2000);
		assertEquals(true, rs);
	}

	@Test
	public void testInvalidDate() {
		boolean rs = DateTimeChecker.validDate(31, 4, 2022);
		assertEquals(false, rs);
	}

	@Test
	public void testInvalidMonth() {
		boolean rs = DateTimeChecker.validDate(15, 13, 2022);
		assertEquals(false, rs);
	}

	@Test
	public void testNegativeDay() {
		boolean rs = DateTimeChecker.validDate(-5, 8, 2022);
		assertEquals(false, rs);
	}

	@Test
	public void testNullInputs() {
		boolean rs = DateTimeChecker.validDate(null, 8, 2022);
		assertEquals(false, rs);
	}

	@Test
	public void testStringInputs() {
		boolean rs = DateTimeChecker.validDate("10", "8", "2022");
		assertEquals(true, rs);
	}

	@Test
	public void testStringInputsNotNumber() {
		boolean rs = DateTimeChecker.validDate("1asd", "8asd", "dassa");
		assertEquals(false, rs);
	}

	@Test
	public void testValidDateLeapYear() {
		boolean rs = DateTimeChecker.validDate(29, 2, 2020);
		assertEquals(true, rs);
	}

	@Test
	public void testValidDateNonLeapYear() {
		boolean rs = DateTimeChecker.validDate(29, 2, 2021);
		assertEquals(false, rs);
	}
}
