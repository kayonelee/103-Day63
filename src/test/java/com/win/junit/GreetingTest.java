import com.win.junit.Greeting;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {

    @DisplayName("Test GreetingTest() method")
    @Test
    void testMainOutput() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        String input = "John Doe";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        Greeting.main(new String[0]);

        String output = outputStream.toString().trim();

        String[] actualLines = output.split(System.lineSeparator()); // SPLIT OUTPUT INTO ARRAY LINES (FAILED WITHOUT)

        String[] expectedLines = { // VERIFY LINES FOR OUTPUT
                "What's your name?",
                "Hi John Doe"
        };
        assertEquals(expectedLines.length, actualLines.length);
        for (int i = 0; i < expectedLines.length; i++) {
            assertEquals(expectedLines[i], actualLines[i]);
        }
    }
}
