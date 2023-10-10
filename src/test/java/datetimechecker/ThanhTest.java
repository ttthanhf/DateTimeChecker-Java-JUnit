/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datetimechecker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ThanhF
 */
public class ThanhTest {

    @Test
    public void checkDayInMonthUTCID01() {
        int rs = DateTimeChecker.getDayByMonthAndYear(1, 1901);
        assertEquals(rs, 31);
    }

    @Test
    public void checkDayInMonthUTCID02() {
        int rs = DateTimeChecker.getDayByMonthAndYear(2, 1901);
        assertEquals(rs, 28);
    }

    @Test
    public void checkDayInMonthUTCID03() {
        int rs = DateTimeChecker.getDayByMonthAndYear(2, 1900);
        assertEquals(rs, 28);
    }

    @Test
    public void checkDayInMonthUTCID04() {
        int rs = DateTimeChecker.getDayByMonthAndYear(2, 2000);
        assertEquals(rs, 29);
    }

    @Test
    public void checkDayInMonthUTCID05() {
        int rs = DateTimeChecker.getDayByMonthAndYear(4, 1900);
        assertEquals(rs, 30);
    }

}
