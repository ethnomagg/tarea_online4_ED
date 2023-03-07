/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import numerosprimos.CribaEratostenes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Max
 */
public class CribaEratostenesTest {

    public CribaEratostenesTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGenerarPrimos0() {
        int[] expected = new int[0];
        int[] actual = CribaEratostenes.generarPrimos(0);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGenerarPrimos2() {
        int[] expected = {2};
        int[] actual = CribaEratostenes.generarPrimos(2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGenerarPrimos3() {
        int[] expected = {2, 3};
        int[] actual = CribaEratostenes.generarPrimos(3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGenerarPrimos100() {
        int[] expected = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        };
        int[] actual = CribaEratostenes.generarPrimos(100);
        assertArrayEquals(expected, actual);
    }
}
