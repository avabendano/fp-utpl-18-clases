/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios10.pkg05.pkg2018;

import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        // Declaracion de variable para ingresar datos
        Scanner entrada = new Scanner(System.in);
        // Declaracion de variables
        double estatura, promedio = 0;
        boolean condicion = true;
        int contador = 0;
        String cadena_final = String.format("%s\n", "estatura", "estudiante");

        while (condicion) {

            System.out.printf("\nIngrese la estatura del estudiante");
            estatura = entrada.nextDouble();

            if (estatura < 1.20) {
                estatura = 1.20;
            }

            promedio += estatura;
            contador += 1;

            cadena_final = String.format("%s%.2f\n", cadena_final, estatura);
            entrada.nextLine();

            System.out.println("Ingrese 'si' para salir ");
            String temp = entrada.nextLine();
            if (temp.equals("si")) {
                condicion = false;
            }

        }
        promedio = promedio / contador;
        System.out.printf("%s\npromedio de estaturas: %.2f\nreporte generado por Dep. Deportes\n", cadena_final, promedio);

    }

}
