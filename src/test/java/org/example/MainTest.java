package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void printsGitHubForNumbersContainingSeven() {
        List<String> lines = runMain();

        assertEquals(100, lines.size());
        assertOutputForNumber(lines, 7, "GitHub");
        assertOutputForNumber(lines, 17, "GitHub");
        assertOutputForNumber(lines, 67, "GitHub");
    }

    private List<String> runMain() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(output, true, StandardCharsets.UTF_8));
            Main.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        return output.toString(StandardCharsets.UTF_8).lines().toList();
    }

    private void assertOutputForNumber(List<String> lines, int number, String expected) {
        assertEquals(expected, lines.get(number));
    }
}
