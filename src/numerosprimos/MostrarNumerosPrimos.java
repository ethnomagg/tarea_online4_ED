/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosprimos;

/**
 * Clase para probar el algoritmo de la criba de Eratóstenes para generar
 * números numerosPrimos.
 *
 * @author arkano
 */
public class MostrarNumerosPrimos {

    public static void main(String[] args) {

        // Constante para el valor limite de rango de busqueda
        final int MAX_LIMITE = 100;
        // array con los resultados obtenidos del método "generarPrimos"
        int[] numerosPrimos = CribaEratostenes.generarPrimos(MAX_LIMITE);
        // variable auxiliar para control de longitud de la linea mostrada
        int count = 0;
        // Limite de longitud de la linea mostrada
        int longitudLinea = 70;

        // Mostramos los numerosPrimos generados en lineas hasta 70 caracteres
        for (int primo : numerosPrimos) {
            System.out.print(primo + " ");
            count += Integer.toString(primo).length() + 1;
            if (count > longitudLinea) {
                System.out.println();
                count = 0;
            }
        }
        if (count > 0) {
            System.out.println();
        }

    }
}
