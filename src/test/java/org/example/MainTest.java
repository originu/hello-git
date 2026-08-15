package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {
    @Test
    void printsResultsForAllArithmeticOperations() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try {
            System.setOut(new PrintStream(output, true, StandardCharsets.UTF_8));
            Main.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        String result = output.toString(StandardCharsets.UTF_8);
        assertTrue(result.contains("10.0 + 5.0 = 15.0"));
        assertTrue(result.contains("10.0 - 5.0 = 5.0"));
        assertTrue(result.contains("10.0 * 5.0 = 50.0"));
        assertTrue(result.contains("average(10.0, 5.0) = 7.5"));
        assertTrue(result.contains("10.0 / 5.0 = 2.0"));
    }
}
