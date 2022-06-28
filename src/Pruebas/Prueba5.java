package Pruebas;

import java.util.Scanner;

public class Prueba5 {
    public static void main(String[] args) {

        final double iva = 0.21;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        double price = Double.parseDouble(scan.nextLine());
        double cal = price * iva;
        //System.out.println("iva = " + cal);
        double total = price + cal;
        System.out.println("El precio del producto es  " + price + " y su iva es de " + cal);
        System.out.println("Total producto con iva " + total);
        
        

    }
}


