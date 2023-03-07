/**
 * Clase para generar todos los números primos de 1 hasta
 * un número máximo especificado por el usuario. Como
 * algoritmo se utiliza la criba de Eratóstenes.
 *
 * Eratóstenes de Cirene (276 a.C., Cirene, Libia – 194
 * a.C., Alejandría, Egipto) fue el primer hombre que
 * calculó la circunferencia de la Tierra. También
 * se le conoce por su trabajo con calendarios que ya
 * incluían años bisiestos y por dirigir la mítica
 * biblioteca de Alejandría.
 *
 * El algoritmo es bastante simple: Dado un vector de
 * enteros empezando en 2, se tachan todos los múltiplos
 * de 2. A continuación, se encuentra el siguiente
 * entero no tachado y se tachan todos sus múltiplos. El
 * proceso se repite hasta que se pasa de la raíz cuadrada
 * del valor máximo. Todos los números que queden sin
 * tachar son números primos.
 */
package numerosprimos;

public class CribaEratostenes {

    /**
     * Genera un array con todos los números primos desde 2 hasta max.
     *
     * @param max el valor máximo hasta el cual se buscarán los números primos.
     * @return un array de enteros con todos los números primos encontrados.
     */
    public static int[] generarPrimos(int max) {
        // Si el máximo es menor a 2, no hay primos que generar, devolver un array vacío
        if (max < 2) {
            return new int[0];
        }

        // Inicializar un array de booleanos para marcar los números primos
        boolean[] esPrimo = new boolean[max + 1];

        // Inicializar todos los números desde 2 hasta max como primos
        for (int i = 2; i <= max; i++) {
            esPrimo[i] = true;
        }

        // Marcar los números compuestos como no primos
        for (int i = 2; i <= Math.sqrt(max); i++) {
            if (esPrimo[i]) {
                // Si i es primo, marcar todos los múltiplos de i como no primos
                for (int j = i * i; j <= max; j += i) {
                    esPrimo[j] = false;
                }
            }
        }

        // Contar la cantidad de números primos para inicializar el array que los almacenará
        int cuentaPrimos = 0;
        for (boolean b : esPrimo) {
            if (b) {
                cuentaPrimos++;
            }
        }

        // Inicializar el array que almacenará los números primos
        int[] primos = new int[cuentaPrimos];

        // Llenar el array con los números primos encontrados
        int indicePrimos = 0;
        for (int i = 2; i <= max; i++) {
            if (esPrimo[i]) {
                primos[indicePrimos++] = i;
            }
        }

        // Devolver el array de números primos
        return primos;
    }

}
