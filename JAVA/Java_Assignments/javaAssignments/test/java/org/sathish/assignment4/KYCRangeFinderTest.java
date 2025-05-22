package org.sathish.assignment4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KYCRangeFinderTest {

    // Normal case ==>
    @Test
    public void testValidWindow() {
        assertEquals("16-06-2016 15-08-2016", KYCRangeFinder.findKYCWindow("16-07-1998", "27-06-2017"));

    }

    //Signup date after current date
    @Test
    public void testSignupAfterCurrent() {
        assertEquals("No range", KYCRangeFinder.findKYCWindow("01-01-2026", "01-01-2025"));
    }

    //Invalid date format
    @Test
    public void testInvalidDateFormat() {
        assertEquals("No range", KYCRangeFinder.findKYCWindow("invalid-date", "01-01-2025"));
    }

    //One valid and one invalid date
    @Test
    public void testOneValidOneInvalid() {
        assertEquals("No range", KYCRangeFinder.findKYCWindow("01-01-2020", "invalid-date"));
    }

    //Empty strings as input
    @Test
    public void testEmptyInput() {
        assertEquals("No range", KYCRangeFinder.findKYCWindow("", ""));
    }

    //Null input values
    @Test
    public void testNullInput() {
        assertEquals("No range", KYCRangeFinder.findKYCWindow(null, null));
    }
}
