/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datetimechecker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Hana
 */
public class HanLTNTest {
    @Test
    public void checkDateUTCID11() {
        boolean rs = DateTimeChecker.validDate(31, 4, 2023);
         assertEquals(false, rs);
    }
    
     @Test
    public void checkDateUTCID12() {
        boolean rs = DateTimeChecker.validDate(29, 2, 2024);
         assertEquals(true, rs);
    }
    
     @Test
    public void checkDateUTCID13() {
        boolean rs = DateTimeChecker.validDate(29, 2, 1900);
         assertEquals(false, rs);
    }
    
     @Test
    public void checkDateUTCID14() {
        boolean rs = DateTimeChecker.validDate(29, 2, 1600);
         assertEquals(true, rs);
    }
    
     @Test
    public void checkDateUTCID15() {
        boolean rs = DateTimeChecker.validDate(29, 2, 2023);
         assertEquals(false, rs);
    }
}
