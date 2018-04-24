/*
 1. Inicio
 2. Leer variables
 3. Comprobar variables
 4. Escribo resultado
 5. fin
 */
package deber.pkg1;

import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        int y = 0;

        System.out.println("Ingrese un valor");
        x = entrada.nextInt();

        if (x < 0) {
            y = 3 * x + 10;
        } else if (x > 0) {
            y = (int) (Math.pow(x, 2) + 6);
        }else if(x == 0){
            y = 1;
        }
        System.out.printf("X: %d\nY: %d\n", x,y);
    }

}
