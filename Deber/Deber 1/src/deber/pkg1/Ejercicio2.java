/*
 1.Inicio
 2.leer variables
 3.Comprobacion de variables
 4.Calcular total
 5. Fin
 */
package deber.pkg1;

import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        int tipoCliente;
        int cantidadCelulares;
        double precioCadaCelular;
        double subtotalPagar = 0;
        double descuento = 0;
        double valorTotal = 0;

        System.out.println("Ingrese el nombre del cliente");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido del cliente");
        apellido = entrada.nextLine();
        System.out.println("Ingresar el tipo de cliente");
        tipoCliente = entrada.nextInt();
        System.out.println("Ingresar la cantidad de celulares");
        cantidadCelulares = entrada.nextInt();
        System.out.println("Ingresar el precio por cada celular ");
        precioCadaCelular = entrada.nextDouble();

        subtotalPagar = cantidadCelulares * precioCadaCelular;

        if (tipoCliente == 1) {
            descuento = subtotalPagar * 0.1;
        } else if (tipoCliente == 2) {
            descuento = subtotalPagar * 0.2;
        } else if (tipoCliente == 3) {
            descuento = subtotalPagar * 0.3;
        } else {
            System.out.println("Tipo de cliente no permitido");
        }

        valorTotal = subtotalPagar - descuento;
        System.out.printf("Nombre: %s %s\n", nombre, apellido);
        System.out.printf("Tipo de Cliente: %d\n", tipoCliente);
        System.out.printf("Cantidad de Celulares: %d\n", cantidadCelulares);
        System.out.printf("Precio por cada celular: %.2f\n", precioCadaCelular);
        System.out.printf("Subtotal a Pagar: %.2f\n", subtotalPagar);
        System.out.printf("Descuento: %.2f\n", descuento);
        System.out.printf("Valor final a pagar: %.2f\n", valorTotal);

    }

}
