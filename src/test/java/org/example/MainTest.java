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
        assertEquals("GitHub", Main.calculate(17));
        assertEquals("GitHub", Main.calculate(27));
        assertEquals("GitHub", Main.calculate(75));
        assertEquals("GitHub", Main.calculate(77));
    }

    @Test
    void printsFizzForNumbersMultipleThree(){
        assertEquals("fizz", Main.calculate(3));
        assertEquals("fizz", Main.calculate(18));
    }

    @Test
    void printsBuzzForNumbersMultipleFive(){
        assertEquals("buzz", Main.calculate(5));
        assertEquals("buzz", Main.calculate(40));
    }

    @Test
    void printsFizzBuzzForNumbersMultipleThreeAndFive(){
        assertEquals("fizzbuzz", Main.calculate(15));
        assertEquals("fizzbuzz", Main.calculate(45));
    }

    @Test
    void printsNumberForNumbersNoneMatch(){
        assertEquals("4", Main.calculate(4));
        assertEquals("98", Main.calculate(98));
    }

}
