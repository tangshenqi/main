package seedu.taskmanager.model.task;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.taskmanager.model.task.Description;

public class DescriptionTest {

    @Test
    public void isValidDescription() {
        // invalid description
        assertFalse(Description.isValidDescription("")); // empty string
        assertFalse(Description.isValidDescription(" ")); // spaces only

        // valid description
        assertTrue(Description.isValidDescription("Banana must be ripe"));
        assertTrue(Description.isValidDescription("-")); // one character
        assertTrue(Description.isValidDescription("Meeting at Leng Inc; 1234 Market St, San Francisco CA 2349879, USA")); // long address
    }
}
