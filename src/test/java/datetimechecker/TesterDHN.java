/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datetimechecker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author namdh
 */
public class TesterDHN {

    @Test
    public void checkDateUTCID07() {
        boolean rs = DateTimeChecker.validDate(1, 35, 2000);
        assertEquals(true, rs);
    }
    
    @Test
    public void checkDateUTCID08() {
        boolean rs = DateTimeChecker.validDate(1, 2, "string");
        assertEquals(true, rs);
    }
    
    @Test
    public void checkDateUTCID09() {
        boolean rs = DateTimeChecker.validDate(1, 2, null);
        assertEquals(true, rs);
    }
    
    @Test
    public void checkDateUTCID10() {
        boolean rs = DateTimeChecker.validDate(1, 2, 2075982357);
        assertEquals(true, rs);
    }
    
    @Test
    public void checkDateUTCID16() {
        boolean rs = DateTimeChecker.validDate(null, null, null);
        assertEquals(true, rs);
    }
}
