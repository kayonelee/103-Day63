package com.win.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VacationTest {

    @DisplayName("Test VacationTest() method")
    @Test
    void testMainOutput() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Vacation.main(new String[0]);

        String output = outputStream.toString().trim();

        String[] actualLines = output.split(System.lineSeparator()); // SPLIT OUTPUT INTO ARRAY LINES (FAILED WITHOUT)


        String[] expectedLines = { // VERIFY LINES FOR OUTPUT
                "I'd like to visit",
                "Tokyo",
                "Japan too!"
        };
        assertEquals(expectedLines.length, actualLines.length);
        for (int i = 0; i < expectedLines.length; i++) {
            assertEquals(expectedLines[i], actualLines[i]);
        }
    }
}

//Configure the display name of our test class by annotating it with the
// @DisplayName annotation. This is an optional step, but I think that
// we should always use the @DisplayName annotation because it allows us
// to specify a custom display name that's used by our IDE and other build
// tools when they create or show test reports. In other words, we can
// replace a technical name with a sentence that describes the purpose
// of our test class.