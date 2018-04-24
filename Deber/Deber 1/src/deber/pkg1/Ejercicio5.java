/*
 1. Inicio
 2. Leer variables
 3. Comprobacion de variables
 4. Calculo conversion
 5. Escribir conversion
 6. Fin
 */
package deber.pkg1;

import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int seleccion;
        double f = 0;
        double c = 0;

        System.out.printf("Ingresar una opcion (1 - 2)\n\t1; Celcius -> Fahrenheit\n\t2; Fahrenheit -> Celcius\n\nSeleccion: ");

        seleccion = entrada.nextInt();

        switch (seleccion) {
            case 1:
                System.out.println("Ingresar los grados celcius");
                c = entrada.nextDouble();
                f = (c * 9 / 5) + 32;
                System.out.printf("Celcius: %.2f  ->  Fahrenheit: %.2f\n",c , f);
                break;

            case 2:
                System.out.println("Ingresar los grados Fahrenheit");
                f = entrada.nextDouble();
                c = (f - 32) * 5 / 9;
                System.out.printf("Fahrenheit: %.2f  ->  Celcius: %.2f\n", f, c);
                break;

            default:
                System.out.println("Opcion incorrecta");
                break;

        }

    }
}
