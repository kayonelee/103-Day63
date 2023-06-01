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

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Nicknames.main(new String[0]);

        String output = outputStream.toString().trim();

        String[] actualLines = output.split(System.lineSeparator()); // SPLIT OUTPUT INTO ARRAY LINES (FAILED WITHOUT)


        String[] expectedLines = { // VERIFY LINES FOR OUTPUT
                "matt"
        };
        assertEquals(expectedLines.length, actualLines.length);
        for (int i = 0; i < expectedLines.length; i++) {
            assertEquals(expectedLines[i], actualLines[i]);
        }
    }
}
