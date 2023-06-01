package com.win.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NicknamesTest {

    @DisplayName("Test main() method output")
    @Test
    void testMainOutput() {
        // Redirect System.out to a ByteArrayOutputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the main() method
        Nicknames.main(new String[0]);

        // Get the output from System.out
        String output = outputStream.toString().trim(); // Trim any leading/trailing whitespace

        // Split the output into an array of lines
        String[] actualLines = output.split(System.lineSeparator());

        // Verify the expected output lines
        String[] expectedLines = {
                "matt"
        };
        assertEquals(expectedLines.length, actualLines.length);
        for (int i = 0; i < expectedLines.length; i++) {
            assertEquals(expectedLines[i], actualLines[i]);
        }
    }
}
