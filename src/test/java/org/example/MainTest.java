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
        assertEquals(List.of("fizz", "GitHub", "8"), lines.subList(6, 9));
        assertEquals(List.of("16", "GitHub", "fizz"), lines.subList(16, 19));
        assertEquals(List.of("fizz", "GitHub", "68"), lines.subList(66, 69));
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
