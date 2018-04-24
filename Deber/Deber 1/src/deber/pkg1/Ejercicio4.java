/*
 1. Inicio
 2. Leer variables
 3. Comprobacion de variables
 4. Calcular total
 5. Escribir resultados
 6. Fin
 */
package deber.pkg1;

import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int balonesComprar;
        double precioBalon;
        double valorCancelar = 0;
        double descuento = 0;

        System.out.println("Ingresar el numero de balones a comprar");
        balonesComprar = entrada.nextInt();
        System.out.println("Ingresar el precio de cada balon");
        precioBalon = entrada.nextDouble();
        
        valorCancelar = precioBalon * balonesComprar;
        
        if (balonesComprar == 1) {
            descuento = valorCancelar * 0.5;
        } else if (balonesComprar == 2) {
            descuento = valorCancelar * 0.7;          
        }else if(balonesComprar >= 3){
            descuento = valorCancelar *0.8;
        }else {
            System.out.println("Balones a comprar no puede ser valor < 1");
        }
        valorCancelar = valorCancelar - descuento;
        System.out.printf("Numero de balones a comprar: %d\n", balonesComprar);
        System.out.printf("Precio de cada balon: %.2f\n", precioBalon);
        System.out.printf("Descuento: %.2f\n", descuento);
        System.out.printf("Valor final a cancelar: %.2f\n", valorCancelar);
    }

}
