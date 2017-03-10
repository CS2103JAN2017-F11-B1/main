package seedu.jobs.model.person;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import seedu.jobs.model.task.Time;

public class TimeTest {

    @Test
    public void isValidTime() {
        // invalid Time
        assertFalse(Time.isValidTime("")); // empty string
        assertFalse(Time.isValidTime(" ")); // spaces only
        assertFalse(Time.isValidTime("12/12/2016")); // incomplete time declaration
        assertFalse(Time.isValidTime("12/12/2016 12")); // incomplete time declaration
        assertFalse(Time.isValidTime("12/12/2016 12:")); // incomplete time declaration
        assertFalse(Time.isValidTime("9/12/1993 5:2")); //no preceding zero in the minute portion

        // valid Time
        assertTrue(Time.isValidTime("09/12/1993 15:00")); //preceding zero in the date
        assertTrue(Time.isValidTime("9/12/1993 05:00")); //no preceding zero in the date 
        assertTrue(Time.isValidTime("9/12/1993 5:00")); //no preceding zero in the hour

    }
}