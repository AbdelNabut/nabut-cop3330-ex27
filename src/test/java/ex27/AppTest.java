package ex27;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @org.junit.jupiter.api.Test
    void isNumeric() {
        String a = "a";
        String five = "5";
        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt(a);
        });
        assertEquals(Integer.parseInt(five), 5);

    }

    @org.junit.jupiter.api.Test
    void validateFirstName() {
        assertEquals("ab".length(), 2);
        assertEquals("".length(), 0);
    }

    @org.junit.jupiter.api.Test
    void validateLastName() {
        assertEquals("ab".length(), 2);
        assertEquals("".length(), 0);
    }

    @org.junit.jupiter.api.Test
    void validateZipCode() {
        String a = "gaff";
        String zipcode = "32749";
        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt(a);
        });
        assertEquals(Integer.parseInt(zipcode), 32749);
    }

    @org.junit.jupiter.api.Test
    void validateEmployeeID() {
        String employeeID = "AS-3245";
        String notEmployeeID = "4A-fd23";
        assertTrue(employeeID.matches("^[A-Z]{2}-[0-9]{4}$"));
        assertFalse(notEmployeeID.matches("^[A-Z]{2}-[0-9]{4}$"));
    }

}
