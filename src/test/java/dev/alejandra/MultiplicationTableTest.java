package dev.alejandra;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {

    @Test
    public void testGenerateTableForNumberFive() {
       
        MultiplicationTable table = new MultiplicationTable(5);
        String[] expected = {
            "5 x 1 = 5",
            "5 x 2 = 10",
            "5 x 3 = 15",
            "5 x 4 = 20",
            "5 x 5 = 25",
            "5 x 6 = 30",
            "5 x 7 = 35",
            "5 x 8 = 40",
            "5 x 9 = 45",
            "5 x 10 = 50"
        };

        String[] actual = table.generateTable();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGenerateTableForNumberZero() {
       
        MultiplicationTable table = new MultiplicationTable(0);
        String[] expected = {
            "0 x 1 = 0",
            "0 x 2 = 0",
            "0 x 3 = 0",
            "0 x 4 = 0",
            "0 x 5 = 0",
            "0 x 6 = 0",
            "0 x 7 = 0",
            "0 x 8 = 0",
            "0 x 9 = 0",
            "0 x 10 = 0"
        };

        String[] actual = table.generateTable();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void testGenerateTableForNegativeNumber() {
        
        MultiplicationTable table = new MultiplicationTable(-3);
        String[] expected = {
            "-3 x 1 = -3",
            "-3 x 2 = -6",
            "-3 x 3 = -9",
            "-3 x 4 = -12",
            "-3 x 5 = -15",
            "-3 x 6 = -18",
            "-3 x 7 = -21",
            "-3 x 8 = -24",
            "-3 x 9 = -27",
            "-3 x 10 = -30"
        };

        String[] actual = table.generateTable();

        assertArrayEquals(expected, actual);
    }
}
