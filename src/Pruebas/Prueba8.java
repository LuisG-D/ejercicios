package Pruebas;

import java.util.Scanner;

public class Prueba8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de a");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el valor de b");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el valor de c");
        int c = Integer.parseInt(sc.nextLine());

        double discriminante = Math.pow(b,2)-(4*a*c);

        //Mensaje de traza
        System.out.println(">>" + discriminante);

        if(discriminante > 0){
            double x1=((b*(-1))+Math.sqrt(discriminante))/(2*a);
            double x2=((b*(-1))-Math.sqrt(discriminante))/(2*a);
            System.out.println("El valor de x1 es: " + x1 + " y el valor de x2 es: " + x2);

        }
        else{
            System.out.println("El discriminante es negativo");
        }
    }
}
