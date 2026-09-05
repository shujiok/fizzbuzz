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

        assertEquals("GitHub", lines.get(7));
        assertEquals("GitHub", lines.get(17));
        assertEquals("GitHub", lines.get(67));
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
}
