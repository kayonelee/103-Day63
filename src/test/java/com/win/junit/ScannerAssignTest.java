package com.win.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScannerAssignTest {

    @DisplayName("Test ScannerAssignTest() method")
    @Test
    void testMainOutput() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        String input = "I'm doing great!\nI had a fantastic day!";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);


        ScannerAssign.main(new String[0]);

        String output = outputStream.toString().trim();

        String[] actualLines = output.split(System.lineSeparator()); // SPLIT OUTPUT INTO ARRAY LINES (FAILED WITHOUT)


        String[] expectedLines = { // VERIFY LINES FOR OUTPUT
                "Hello there! How are you doing today?",
                "Wow - Interesting! Tell me more!",
                "Nice chatting with you! Goodbye!"
        };
        assertEquals(expectedLines.length, actualLines.length);
        for (int i = 0; i < expectedLines.length; i++) {
            assertEquals(expectedLines[i], actualLines[i]);
        }
    }
}
