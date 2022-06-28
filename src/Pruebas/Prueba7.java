package Pruebas;

import java.util.Scanner;

public class Prueba7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Intrduce el numero de ventas");
        int numVentas = Integer.parseInt(scan.nextLine());

        int precioVenta = 0;
        for (int i=0; i<numVentas;i++){
            System.out.println("Introduce el precio de la venta" + (1+i));
            int venta = Integer.parseInt(scan.nextLine());
            precioVenta=precioVenta+venta;
            
        }
        System.out.println("Total de las ventas = " + precioVenta);


    }
}
