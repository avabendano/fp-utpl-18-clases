/*
 1. Inicio
 2. leer dia
 3. Comprobar dia
 4. Escribir dia
 5. fin
 */
package deber.pkg1;

import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;
        System.out.println("Ingrese un numero para determinar que dia es:");
        dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

        }

    }

}
