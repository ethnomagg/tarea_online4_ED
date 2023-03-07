/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import numerosprimos.CribaEratostenes;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CribaEratostenesTest {

    @BeforeAll
    public static void setUpClass() {
        // Código de configuración global antes de ejecutar los tests
    }

    @AfterAll
    public static void tearDownClass() {
        // Código de limpieza global después de ejecutar los tests
    }

    @BeforeEach
    public void setUp() {
        // Código de configuración específico antes de cada test
    }

    @AfterEach
    public void tearDown() {
        // Código de limpieza específico después de cada test
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
