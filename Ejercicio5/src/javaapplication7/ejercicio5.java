package javaapplication7;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int num = scanner.nextInt();
        
        int doble = num * 2;
        int triple = num * 3;
        double raizCuadrada = Math.sqrt(num);

        System.out.println("El doble de " + num + " es " + doble);
        System.out.println("El triple de " + num + " es " + triple);
        System.out.println("La raíz cuadrada de " + num + " es " + raizCuadrada);
    }
}




