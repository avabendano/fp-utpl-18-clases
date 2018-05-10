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
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        int edad = 0;
        int contador = 1;
        String cadena_final = String.format("%s\t%s\n", "Edad", "Suma");
        while (contador <= 5) {
            System.out.printf("Ingrese el valor de edad");
            edad = entrada.nextInt();
            suma = suma + edad;
            cadena_final = String.format("%s%d\t%d\n", cadena_final, edad, suma);
            contador = contador + 1;

        }
        System.out.printf("%s", cadena_final);
    }
}
